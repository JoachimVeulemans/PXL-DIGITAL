window.addEventListener("load", loaded);

function loaded() {
    document.getElementById("buttonSend").addEventListener("click", getAuthorAndBooks);
}

function getAuthorAndBooks() {
    let url = 'http://192.168.33.22/10_Herhalingsoefening/code/list.php?id=';
    let id = document.getElementById("textAuthorID").value;
    let output = document.getElementById("divOutput");
    if (id.trim() !== '') {
        fetch(url + id)
            .then((response) => {
                if (response.status === 200) {
                    return response.json();
                } else {
                    throw `error with status ${response.status}`;
                }
            })
            .then((author) => {
                console.log(author);

                output.innerText = author.name;

                for (let i = 0; i < author.books.length; i++) {
                    output.innerText += " " + author.books[i].title;
                }
            })
            .catch((error) => {
                output.appendChild(document.createTextNode(error));
            });
    }
}
