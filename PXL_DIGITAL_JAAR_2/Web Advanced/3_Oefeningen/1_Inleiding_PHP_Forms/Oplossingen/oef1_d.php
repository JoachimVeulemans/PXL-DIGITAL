<?php
$aantalLijnen = 8;
$interval = 5;
$counter = 0;
for ($i = 0; $i < $aantalLijnen; $i++ ) {
    for ($j = 0; $j < $aantalLijnen - $i; $j++ ) {
        print("&nbsp;&nbsp;");
    }
    for ($j = 0; $j < $i; $j++ ) {
        if ($counter % $interval == 0) {
            print("@");
        } else {
            print("#");
        }
        $counter++;
    }
    for ($j = 0; $j < $i - 1; $j++ ) {
        if ($counter % $interval == 0) {
            print("@");
        } else {
            print("#");
        }
        $counter++;
    }
    print("<br>");
}
