for (let i = 1; i <= 100; i++) {
    console.log(i % 3 === 0 ? i % 5 === 0 ? "FizzBuzz" : "Fizz" : i % 5 === 0 ? "Buzz" : i);
}