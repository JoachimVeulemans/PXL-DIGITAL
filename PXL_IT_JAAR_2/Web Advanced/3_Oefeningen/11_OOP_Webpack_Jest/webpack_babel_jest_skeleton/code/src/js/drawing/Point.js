"use strict";

export default class Point{
	constructor(x,y){
  		if (isNaN(x) || isNaN(y)) {
    		throw new Error("Parameter is not a number!");
  		}
		this.x=x;
		this.y=y;
	}

	getX(){
		return this.x;
	}
	getY(){
		return this.y;
	}

    toString() {
        return `(${this.x},${this.y})`;
    }
}
