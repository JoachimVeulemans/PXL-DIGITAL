let amountOfLines = 7;
let interval = 5;

let counter = 0;
for (let i = 0; i < amountOfLines; i++) {
    let stringToAdd = "";
    for (let j = 0; j < 2 * i + 1; j++) {
        stringToAdd += counter % interval === 0 ? "@" : "#";
        counter++;
    }
    console.log(`${" ".repeat(amountOfLines - 1 - i)}${stringToAdd}`);
}