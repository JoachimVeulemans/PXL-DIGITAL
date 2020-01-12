const createRow = (min, max, step = 1) => (min + step <= max && step > 1) || (max <= min + step && step < 0) ? [min].concat(createRow(min + step, max, step)) : [min];

console.log(createRow(3, -5, -2));