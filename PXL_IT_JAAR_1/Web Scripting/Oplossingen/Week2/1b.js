const min = (...numbers) => {
    let lowest = numbers[0];
    for (let number of numbers) {
        lowest = number < lowest ? number : lowest;
    }
    return lowest;
};

console.log(min(1, 2, 4, -1, 2, 3));