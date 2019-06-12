"use strict";

export default class Date {
    static get MONTHS() {
        return ['jan', 'feb', 'mar', 'apr', 'may', 'jun', 'jul', 'aug', 'sep', 'oct', 'nov', 'dec'];
    }

    constructor(day, month, year){
        this._day = day;
        this._month = month;
        this._year = year;
    }

    toString() {
        return `${this._day}/${this._month}/${this._year}`;
    }

    toStringMonth() {
        return `${this._day}/${Date.MONTHS[parseInt(this._month) - 1]}/${this._year}`;
    }

    static make(day, month, year) {
        return new Date(day, month, year);
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
}
