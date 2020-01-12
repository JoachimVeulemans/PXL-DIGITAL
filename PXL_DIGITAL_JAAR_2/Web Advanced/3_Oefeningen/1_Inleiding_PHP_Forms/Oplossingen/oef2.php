<?php

function maakRij($min, $max, $step = 1) {
    if ($step > 0) {
        for($i = $min; $i <= $max; $i = $i + $step) {
            $array[] = $i;
        }
    } else {
        for($i = $min; $i >= $max; $i = $i + $step) {
            $array[] = $i;
        }
    }

    return $array;
}

print_r(array_values(maakRij(1, 5, 2)));
print_r(array_values(maakRij(5, 1, -2)));
