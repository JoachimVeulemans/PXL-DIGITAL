'use strict';

const byTagName = (node, tag) => {
    return node.getElementsByTagName(tag.toUpperCase());
};

const handleLoad = () => {
    console.log(byTagName(document.body, "h1"));
    console.log(byTagName(document.getElementsByTagName("h1")[0], "span"));
    console.log(byTagName(document.getElementsByTagName("p")[0], "span"));
};

window.addEventListener("load", handleLoad);