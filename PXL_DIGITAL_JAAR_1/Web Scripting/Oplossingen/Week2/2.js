const isEven = number => number === 0 ? true : number === 1 ? false : number > 1 ? isEven(number - 2) : isEven(number + 2);

console.log(isEven(4));