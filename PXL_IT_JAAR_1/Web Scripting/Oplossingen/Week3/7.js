const MONTHS = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

class Date {
    constructor(day, month, year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    get day() {
        return this._day;
    }

    set day(value) {
        this._day = value;
    }

    get month() {
        return this._month;
    }

    set month(value) {
        this._month = value;
    }

    get year() {
        return this._year;
    }

    set year(value) {
        this._year = value;
    }

    print() {
        console.log(`${this.day}/${this.month}/${this.year}`);
    }

    printMonth() {
        console.log(`${this.day}/${MONTHS[this.month - 1].substr(0, 3).toLowerCase()}/${this.year}`);
    }

    static make(day, month, year) {
        return new Date(day, month, year);
    }
}

let date = Date.make(1, 2, 2001);
date.print();
date.printMonth();