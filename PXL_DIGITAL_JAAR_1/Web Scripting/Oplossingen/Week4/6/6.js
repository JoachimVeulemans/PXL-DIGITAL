'use strict';

const handleClickGenerateOutput = () => {
    let outputNode = document.getElementById("output");
    while (outputNode.firstChild !== null) {
        outputNode.removeChild(outputNode.firstChild);
    }

    let firstName = document.getElementById("firstNameInput").value;
    let lastName = document.getElementById("lastNameInput").value;

    if (lastName === "" || firstName === "") {
        outputNode.appendChild(document.createTextNode("Please fill in all the fields."));
    } else {
        outputNode.appendChild(document.createTextNode(`Welcome ${firstName} ${lastName}`));
    }
};

const handleLoad = () => {
    document.getElementById("generateOutputButton").addEventListener("click", handleClickGenerateOutput);
};

window.addEventListener("load", handleLoad);