<?php

namespace model;

class PDOPersonModel implements PersonModel
{
    private $pdo = null;

    public function __construct(\PDO $pdo)
    {
        $this->pdo = $pdo;
    }

    public function listPersons()
    {
        $statement = $this->pdo->prepare('SELECT * FROM persons');
        $statement->execute();
        $statement->bindColumn(1, $id, \PDO::PARAM_INT);
        $statement->bindColumn(2, $name, \PDO::PARAM_STR);

        $persons = [];
        while ($statement->fetch(\PDO::FETCH_BOUND)) {
            $persons[] = ['id' => $id, 'name' => $name];
        }
        return $persons;
    }


    public function addPersonByIdAndName($id, $name)
    {
        $this->validateId($id);
        $this->validateName($name);

        $statement = $this->pdo->prepare('INSERT into persons(id,name) VALUES (:id,:name) ON DUPLICATE KEY UPDATE id=:id, name=:name');
        $statement->bindParam(':id', $id, \PDO::PARAM_INT);
        $statement->bindParam(':name', $name, \PDO::PARAM_STR);
        $statement->execute();

        return ['id' => $id, 'name' => $name];
    }


    public function idExists($id)
    {
        $this->validateId($id);
        $statement = $this->pdo->prepare('SELECT id from persons WHERE id=:id');
        $statement->bindParam(':id', $id, \PDO::PARAM_INT);
        $statement->execute();
        if ($statement->fetch() === FALSE) {
            return FALSE;
        }
        return TRUE;
    }

    private function validateId($id){
        if (!(is_string($id) &&  preg_match("/^[0-9]+$/", $id) && (int)$id > 0)) {
            throw new \InvalidArgumentException("id moet een int > 0 bevatten ");
        }
    }

    private function validateName($name)
    {
        if (!(is_string($name) && strlen($name) >= 2)) {
            throw new \InvalidArgumentException("name moet een string met minstens 2 karakters zijn");
        }
    }

}
