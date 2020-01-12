class Account {
    constructor(countryCode, bankNumber, firstTenPositions) {
        this.countryCode = countryCode;
        this.bankNumber = bankNumber;
        this.firstTenPositions = firstTenPositions;
    }

    get countryCode() {
        return this._countryCode;
    }

    set countryCode(value) {
        this._countryCode = value;
    }

    get bankNumber() {
        return this._bankNumber;
    }

    set bankNumber(value) {
        this._bankNumber = value;
    }

    get firstTenPositions() {
        return this._firstTenPositions;
    }

    set firstTenPositions(value) {
        this._firstTenPositions = value;
    }

    print() {
        let checkNumber = this.firstTenPositions % 97;
        console.log(`${this._countryCode} ${this._bankNumber} ${this._firstTenPositions.substr(0, 4)} ${this._firstTenPositions.substr(4, 4)} ${this._firstTenPositions.substr(8)}${checkNumber.length < 2 ? "0" + checkNumber : checkNumber}`);
    }
}

let account = new Account("BE", "76", "0012587909");
account.print();