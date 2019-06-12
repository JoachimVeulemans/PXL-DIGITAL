'use strict';

class Person {
    constructor(name, firstName, dateOfBirth) {
        this.name = name;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }

    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get firstName() {
        return this._firstName;
    }

    set firstName(value) {
        this._firstName = value;
    }

    get dateOfBirth() {
        return this._dateOfBirth;
    }

    set dateOfBirth(value) {
        this._dateOfBirth = value;
    }

    calculateAge() {
        let today = new Date();
        let age = today.getFullYear() - this.dateOfBirth.getFullYear();
        let monthDifference = today.getMonth() - this.dateOfBirth.getMonth();
        return monthDifference < 0 || (monthDifference === 0 && today.getDate() < this.dateOfBirth.getDate()) ? age - 1 : age;
    }

    print() {
        console.log(`Name: ${this.name}\nFirstname: ${this.firstName}\nAge: ${this.calculateAge()}`);
    }
}

let rizzo = new Person("Rizzo", "Dillon", new Date(1997, 5, 26));

let turbo = new Person();
turbo.name = "Silfver";
turbo.firstName = "Pierre";
turbo.dateOfBirth = new Date(1998, 8, 9);

rizzo.print();
console.log("\n\n");
turbo.print();



