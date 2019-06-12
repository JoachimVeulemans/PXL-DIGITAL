"use strict";

export default class PersonModel {
    constructor(url) {
        this.url = url;
    }

    listPersons() {
        return fetch(this.url, {method: "GET"})
            .then((response) => {
                if (!response.ok) {
                    throw new Error("rejected:" + response.status);
                }
                return response.json();
            })
    }

    addPersonByIdAndName(id, name) {
        if (!(typeof id == 'string' && /^[0-9]+$/.test(id) && parseInt(id) > 0)) {
            return Promise.reject(new Error("id moet een string zijn met een getal > 0"));
        }

        if (!(typeof name == 'string' && name.length >= 2)) {
            return Promise.reject(new Error("name moet een string met minstens 2 karakters zijn"));
        }

        let person = {name: name};
        return fetch(this.url + id, {method: "PUT", body: JSON.stringify(person)})
            .then((response) => {
                if (!response.ok) {
                    throw new Error("rejected:" + response.status);
                }
                return response.json();
            });
    }
}

