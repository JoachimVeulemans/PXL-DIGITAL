<?php

require_once("Util/Author.php");
require_once("Util/Book.php");

if (isset($_GET['id']))
{
    $id = $_GET["id"];
    $user='root';
    $password='root';
    $database = 'examen';
    $output = null;

    try {
        $query = 'SELECT * from author WHERE id = ' . $id;
        $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
        $statement = $pdo->prepare($query);
        $statement->setFetchMode(PDO::FETCH_ASSOC);
        $statement->execute();
        while (($row = $statement->fetch()) !== false) {
            $output = new Author($row["id"], $row["name"], []);
        }

        if ($output !== null) {
            $query = 'SELECT * from book WHERE author_id = ' . $id;
            $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
            $statement = $pdo->prepare($query);
            $statement->setFetchMode(PDO::FETCH_ASSOC);
            $statement->execute();
            while (($row = $statement->fetch()) !== false) {
                $output->addBook(new Book($row["id"], $row["title"]));
            }
        }
    } catch (PDOException $e) {
        print('Exception: ' . $e->getMessage());
    }
    $pdo = null;

    if ($output !== null) {
        print($output->getJSONString());
    } else {
        print("{}");
    }

} else {
    print("{}");
}
