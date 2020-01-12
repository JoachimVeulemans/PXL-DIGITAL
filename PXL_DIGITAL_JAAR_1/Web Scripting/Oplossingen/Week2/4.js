const countB = word => countChar(word.toUpperCase(), "B");

const countChar = (word, char) => word.indexOf(char) === -1 ? 0 : 1 + countChar(word.substr(word.indexOf(char) + 1), char);

console.log(countB("5 B B b B b's"));