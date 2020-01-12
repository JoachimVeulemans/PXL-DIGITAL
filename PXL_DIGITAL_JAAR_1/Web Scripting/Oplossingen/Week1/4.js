let lowest = 1;
let highest = 100;

while (lowest % 3 !== 0) {
    lowest++;
}
for (let i = lowest; i <= highest; i += 3) {
    console.log(i);
}