<?php

function faculteit($getal) {
    $faculteit = 1;

    for ($i = 1; $i <= $getal; $i++) {
        $faculteit = $faculteit * $i;
    }

    return $faculteit;
}
