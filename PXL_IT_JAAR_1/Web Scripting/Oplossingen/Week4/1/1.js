'use strict';

const createTable = (container, data) => {
    // Create table
    let table = document.createElement("table");

    // Create and fill thead
    let thead = document.createElement("thead");
    let row = document.createElement("tr");
    for (let key of Object.keys(data[0])) {
        let td = document.createElement("td");
        let textNode = document.createTextNode(key);
        td.appendChild(textNode);
        row.appendChild(td);
    }
    thead.appendChild(row);
    table.appendChild(thead);

    // Create and fill tbody
    let tbody = document.createElement("tbody");
    for (let object of data) {
        let row = document.createElement("tr");
        for (let key of Object.keys(object)) {
            let td = document.createElement("td");
            let textNode = document.createTextNode(object[key]);
            td.appendChild(textNode);
            if (typeof object[key] === "number") {
                td.style.textAlign = "right";
            }
            row.appendChild(td);
        }
        tbody.appendChild(row);
    }
    table.appendChild(tbody);

    container.appendChild(table);
};

const handleLoad = () => {
    const MOUNTAINS = [
        {name: "Kilimanjaro", height: 5895, place: "Tanzania"},
        {name: "Everest", height: 8848, place: "Nepal"},
        {name: "Mount Fuji", height: 3776, place: "Japan"},
        {name: "Vaalserberg", height: 323, place: "Netherlands"},
        {name: "Denali", height: 6168, place: "United States"},
        {name: "Popocatepetl", height: 5465, place: "Mexico"},
        {name: "Mont Blanc", height: 4808, place: "Italy/France"}
    ];
    createTable(document.getElementById("tableContainer"), MOUNTAINS);
};

window.addEventListener("load", handleLoad);