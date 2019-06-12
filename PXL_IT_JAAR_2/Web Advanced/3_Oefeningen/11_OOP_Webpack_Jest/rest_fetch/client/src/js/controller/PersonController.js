"use strict";

export default class PersonController {
    constructor(personModel, personView, personsView, errorView) {
        this.personModel = personModel;
        this.personView = personView;
        this.personsView = personsView;
        this.errorView = errorView;
    }

    listPersons() {
        let promise = this.personModel.listPersons();
        promise.then( (persons) => {
            this.personsView.show({persons: persons});
        }).catch(error => {
            this.errorView.show({error: error.message});
        });
    }


    addPersonByIdAndName(id, name) {
        let promise = this.personModel.addPersonByIdAndName(id, name);
        promise.then( (person) => {
            this.personView.show({person: person});
        }).catch(error => {
            this.errorView.show({error: error.message});
        });
    }
}
