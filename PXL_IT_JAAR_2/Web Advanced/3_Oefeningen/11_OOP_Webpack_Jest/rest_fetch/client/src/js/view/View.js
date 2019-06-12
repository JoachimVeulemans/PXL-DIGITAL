"use strict";

export default class View {
    constructor(){
        this.outputElement=document.getElementById('output');

    }
    show(data) {

        while (this.outputElement.hasChildNodes()) {
            this.outputElement.removeChild(this.outputElement.firstChild);
        }
        let textNode = document.createTextNode(data);
        this.outputElement.appendChild(textNode);
    }
}



