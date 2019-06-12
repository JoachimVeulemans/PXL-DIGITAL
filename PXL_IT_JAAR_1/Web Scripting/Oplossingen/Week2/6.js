const reverseArray = array => {
    for (let i = 0; i < Math.floor(array.length / 2); i++) {
        let item = array[array.length - i - 1];
        array[array.length - i - 1] = array[i];
        array[i] = item;
    }
    return array;
};

console.log(reverseArray([1, 2, 3, 4]));