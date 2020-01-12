let size = 8;
let isNextCharHashtag = true;

for (let i = 0; i < size; i++) {
    let nextString = "";
    for (let j = 0; j < size; j++) {
        nextString += isNextCharHashtag ? "#" : " ";
        isNextCharHashtag = !isNextCharHashtag;
    }
    console.log(nextString);
    isNextCharHashtag = size % 2 === 0 ? !isNextCharHashtag : isNextCharHashtag;
}
