const calculateDistance = (coord1, coord2) => Math.sqrt(Math.pow(coord1.x - coord2.x, 2) + Math.pow(coord1.y - coord2.y, 2));

let punt1 = {x:1, y:1};
let punt2 = {x:2, y:3};
console.log(calculateDistance(punt1, punt2 ));