<?php

$getal = $_POST["number"];

if (!is_double($getal) && $getal > 0) {
    require_once ('wiskunde.php');
    print(faculteit($getal));
} else {
    print("incorrecte ingave");
}
