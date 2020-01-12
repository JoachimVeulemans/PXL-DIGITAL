'use strict';

let person = {
    name: "Rizzo",
    firstName: "Dillon",
    dateOfBirth: new Date(1997, 5, 26),
    calculateAge() {
        let today = new Date();
        let age = today.getFullYear() - this.dateOfBirth.getFullYear();
        let monthDifference = today.getMonth() - this.dateOfBirth.getMonth();
        return monthDifference < 0 || (monthDifference === 0 && today.getDate() < this.dateOfBirth.getDate()) ? age - 1 : age;
    },
    print() {
        console.log(`Name: ${this.name}\nFirstname: ${this.firstName}\nAge: ${this.calculateAge()}`);
    }
};

person.print();