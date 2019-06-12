class Point {
    get x() {
        return this._x;
    }

    set x(value) {
        this._x = value;
    }

    get y() {
        return this._y;
    }

    set y(value) {
        this._y = value;
    }
}

class WorldObject {
    constructor() {
        this._location = new Point();
        this._location.x = 0;
        this._location.y = 0;
    }

    get x() {
        return this._location.x;
    }

    set x(value) {
        this._location.x = value;
    }

    get y() {
        return this._location.y;
    }

    set y(value) {
        this._location.y = value;
    }
}

class Hero extends WorldObject {
    moveDown() {
        this.y -= 1;
    }

    moveUp() {
        this.y += 1;
    }

    moveLeft() {
        this.x -= 1;
    }

    moveRight() {
        this.x += 1;
    }
}

let hero = new Hero();
hero.moveDown();
hero.moveDown();
hero.moveDown();
hero.moveDown();
hero.moveDown();
console.log(hero._location);
hero.moveLeft();
hero.moveLeft();
hero.moveLeft();
hero.moveLeft();
hero.moveUp();
console.log(hero._location);
