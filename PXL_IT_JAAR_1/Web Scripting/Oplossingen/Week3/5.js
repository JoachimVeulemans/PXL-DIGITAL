class Vector {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    get x() {
        return this._x;
    }

    set x(value) {
        if (typeof value !== "number") {
            throw new InputError(`${value} is not a number!`)
        } else {
            this._x = value;
        }
    }

    get y() {
        return this._y;
    }

    set y(value) {
        if (typeof value !== "number") {
            throw new InputError(`${value} is not a number!`)
        } else {
            this._y = value;
        }
    }

    get length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    plus(vector) {
        if (typeof vector === 'object' || vector instanceof Vector) {
            return new Vector(this.x + vector.x, this.y + vector.y);
        } else {
            throw new InputError(`${vector} is not a Vector`);
        }
    }

    minus(vector) {
        if (typeof vector === 'object' || vector instanceof Vector) {
            return new Vector(this.x - vector.x, this.y - vector.y);
        } else {
            throw new InputError(`${vector} is not a Vector`);
        }
    }

    toString() {
        return `(${this.x},${this.y})`;
    }
}

class InputError extends Error {
    constructor(message) {
        super();
        this.message = message;
    }

    get message() {
        return this._message;
    }

    set message(value) {
        this._message = value;
    }
}

try {
    let vector = new Vector(4, 0);
    vector.x = 1;
    console.log(vector.length);
    console.log(vector.plus(new Vector(1, 3)));
    console.log(vector.minus(new Vector(2, 1)));
} catch ( error ) {
    if (error instanceof InputError) {
        console.log(`An inputError with message '${error.message}' occurred`);
    } else {
        console.log(`unknown error occurred with message '${error.message}'`)
    }
}

