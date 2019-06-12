import Point from "../drawing/Point";

export default class WereldObject {
    constructor(X, Y) {
        this._X = X;
        this._Y = Y;
    }

    get X() {
        return this._X;
    }

    set X(value) {
        this._X = value;
    }

    get Y() {
        return this._Y;
    }

    set Y(value) {
        this._Y = value;
    }
}