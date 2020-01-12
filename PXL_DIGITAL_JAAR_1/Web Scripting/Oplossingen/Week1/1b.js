let amountOfLines = 7;

for (let i = 0; i < amountOfLines; i++) {
    console.log(`${" ".repeat(amountOfLines - 1 - i)}${"#".repeat(i + 1)}`);
}