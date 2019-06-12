<?php
$aantalLijnen = 7;
for ($i = 0; $i < $aantalLijnen; $i++ ) {
    for ($j = 0; $j < $aantalLijnen - $i; $j++ ) {
        print("&nbsp;&nbsp;");
    }
    for ($j = 0; $j < $i; $j++ ) {
        print("#");
    }
    print("<br>");
}
