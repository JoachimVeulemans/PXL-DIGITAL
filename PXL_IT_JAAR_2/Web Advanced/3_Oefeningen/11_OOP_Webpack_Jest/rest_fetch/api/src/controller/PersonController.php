<?php

namespace controller;

use model\PersonModel;
use view\View;

class PersonController
{
    private $personModel;
    private $jsonPersonView;
    private $jsonPersonsView;


    public function __construct(PersonModel $personModel, View $jsonPersonView, View $jsonPersonsView)
    {
        $this->personModel = $personModel;
        $this->jsonPersonView = $jsonPersonView;
        $this->jsonPersonsView = $jsonPersonsView;
    }


    public function listPersons()
    {
        $statuscode = 200;
        $persons = [];
        try {
            $persons = $this->personModel->listPersons();
        } catch (\PDOException $exception) {
            $statuscode = 500;
        }
        $this->jsonPersonsView->show(['persons' => $persons, 'statuscode' => $statuscode]);
    }


    public function addPersonByIdAndName($id, $name)
    {
        $statuscode = 201;
        $person = null;
        try {
            if ($this->personModel->idExists($id)) {
                $statuscode = 200;
            }
            $person = $this->personModel->addPersonByIdAndName($id, $name);
        } catch (\InvalidArgumentException $exception) {
            $statuscode = 400;
        } catch (\PDOException $exception) {
            $statuscode = 500;
        }
        $this->jsonPersonView->show(['person' => $person, 'statuscode' => $statuscode]);
    }
}
