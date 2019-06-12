"use strict";

import PersonController from './controller/PersonController';
import PersonModel from './model/PersonModel';
import PersonView from './view/PersonView';
import PersonsView from './view/PersonsView';
import ErrorView from './view/ErrorView';

let url = 'http://192.168.33.22/api/persons/';

let personView;
let personsView;
let errorView;
let personModel;
let personController;

window.addEventListener("load", handleWindowLoad);

function handleWindowLoad() {
    personView = new PersonView();
    personsView = new PersonsView();
    errorView = new ErrorView();
    personModel = new PersonModel(url);
    personController = new PersonController(personModel, personView, personsView, errorView);

    let btnGETPersons = document.getElementById("btngetpersons");
    btnGETPersons.addEventListener("click", handleClickGetAllPersons);
    let btnPUTPerson = document.getElementById("btnputidname");
    btnPUTPerson.addEventListener("click", handleClickPUTPerson);
}

function handleClickGetAllPersons() {
    personController.listPersons();
}

function handleClickPUTPerson() {
    let id = document.getElementById("txtid").value;
    let name = document.getElementById("txtname").value;
    personController.addPersonByIdAndName(id, name);
}
