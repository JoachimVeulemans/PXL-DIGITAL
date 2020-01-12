let triangleArea = {
    a: 8,
    b: 5,
    c: 10,
    calculateAreaOfTriangle() {
        if (this.isValidTriangle()) {
            let s = (this.a + this.b + this.c) / 2;
            return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        } else {
            throw Error("This is not a valid triangle!");
        }
    },
    isValidTriangle() {
        return !(this.a + this.b <= this.c || this.b + this.c <= this.a || this.c + this.a <= this.b);
    }
};

console.log(triangleArea.calculateAreaOfTriangle());
