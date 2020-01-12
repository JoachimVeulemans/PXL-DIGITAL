window.addEventListener("load", loaded);

function loaded() {
    let input = document.getElementById('inputtext');
    input.addEventListener("input", handleInput);

    document.getElementsByTagName("form")[0].addEventListener('click', function (event) {
        if (event.target.attributes["class"] && event.target.attributes["class"].value.match(/\bsuggestion\b/)) {
            let input = document.getElementById('inputtext');
            input.value = event.target.textContent;
        }
    });
}


function handleInput() {
    let input = document.getElementById('inputtext');
    let name = input.value;
    let url = 'getdata.php?name=' + encodeURIComponent(name);
    //https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent
    let output = document.getElementById("output");
    output.innerHTML = '';
    fetch(url)
        .then((response) => {
            if (response.status == 200) {
                return response.json();
            } else {
                throw `error with status ${response.status}`;
            }
        })
        .then((names) => {
            for (let i = 0; i < names.length; i++) {
                let span = document.createElement('span');
                span.setAttribute('class', 'suggestion');
                span.appendChild(document.createTextNode(names[i].name));
                output.appendChild(span);
                output.appendChild(document.createTextNode(" "));
            }
        });
}
