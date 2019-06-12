import WereldObject from "./WereldObject";

export default class Hero extends WereldObject{
    constructor(X, Y) {
        super(X, Y);
    }

    moveDown() {
        super.Y -= 1;
    }

    moveUp() {
        super.Y += 1;
    }

    moveLeft() {
        super.X -= 1;
    }

    moveRight() {
        super.X += 1;
    }
}
