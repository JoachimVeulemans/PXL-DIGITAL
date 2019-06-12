'use strict';

const handleClickCalculateButton = () => {
    let outputNode = document.getElementById("output");
    while (outputNode.firstChild !== null) {
        outputNode.removeChild(outputNode.firstChild);
    }
    let number1 = parseInt(document.getElementsByClassName("numberInput")[0].value, 10);
    let number2 = parseInt(document.getElementsByClassName("numberInput")[1].value, 10);
    if (!isNaN(number1) && !isNaN(number2)) {
        outputNode.appendChild(document.createTextNode(`By multiplying ${number1} and ${number2}, the resulting number is ${number1 * number2}`));
    } else {
        outputNode.appendChild(document.createTextNode("The input doesn't consist of number. Please verify your input and try again."));
    }
};

const handleLoad = () => {
    document.getElementById("calculateButton").addEventListener("click", handleClickCalculateButton);
    document.getElementsByClassName("numberInput")[0].addEventListener("input", handleClickCalculateButton);
    document.getElementsByClassName("numberInput")[1].addEventListener("input", handleClickCalculateButton);
};

window.addEventListener("load", handleLoad);