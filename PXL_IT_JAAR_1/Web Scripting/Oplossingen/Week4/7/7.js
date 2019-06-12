'use strict';

const handleClickCalculateButton = () => {
    let outputNode = document.getElementById("numbersOutput");
    let inputNumber = parseInt(document.getElementById("numbersInput").value);
    let outputString = "";
    if (isNaN(inputNumber) || inputNumber > 50 || inputNumber < 1) {
        outputNode.value = "Input not a valid number"
    } else {
        let number = 1;
        while (inputNumber >= number) {
            outputString += `${number} `;
            number += 2;
        }
        outputNode.value = outputString.trim();
    }
};

const handleLoad = () => {
    document.getElementById("generateOddNumbersButton").addEventListener("click", handleClickCalculateButton);
};

window.addEventListener("load", handleLoad);