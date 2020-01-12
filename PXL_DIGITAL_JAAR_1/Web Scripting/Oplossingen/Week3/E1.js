const SolveQuadraticEquation = (a, b, c) => {
    let discriminant = Math.pow(b, 2) - 4 * a * c;
    const solveSolution1 = () => (-b + Math.sqrt(discriminant)) / (2 * a);
    if (discriminant < 0) {
        throw Error(`No possible solution for quadratic equation with a: ${a}, b: ${b}, c: ${c}`)
    } else if (discriminant === 0) {
        console.log(`There is one solution where x = ${solveSolution1()}`);
    } else {
        console.log(`There are 2 solutions where x1 = ${solveSolution1()} and x2 = ${(-b - Math.sqrt(discriminant)) / (2 * a)}`)
    }
};

SolveQuadraticEquation(3, -2, -1);