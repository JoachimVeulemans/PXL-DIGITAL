<?php

$getallen = $_POST['getallen'];

$min = $getallen[0];
$max = $getallen[0];
$average = 0.0;

foreach ( $getallen as $index => $number ) {
    if (is_numeric($number)) {
        if ($number < $min) {
            $min = $number;
        }

        if ($number > $max) {
            $max = $number;
        }
    } else {
        $nonNumeric[] = $number;
    }

    $average = $average + $number;
}

$average = $average / count($getallen);

print("Minimum: " . $min);
print_r("<br>");
print("Maximum: " . $max);
print_r("<br>");
print("Gemiddelde: " . $average);
print_r("<br><br>");

foreach ( $nonNumeric as $index => $number ) {
    print_r($number . " - ");
}
