<?php

namespace model;

interface PersonModel
{
    public function idExists($id);

    public function listPersons();

    public function addPersonByIdAndName($id, $name);


}
