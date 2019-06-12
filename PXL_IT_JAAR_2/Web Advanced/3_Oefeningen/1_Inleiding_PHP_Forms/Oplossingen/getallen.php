<?php

$getal1 = $_POST['getal1'];

if (!is_double($getal1) && $getal1 > 0) {
    print_r("<form action='statistiek.php' method='post'>");
    for ($i = 0; $i < $getal1; $i++) {
        print_r("<input type=\"text\" value=\"\" name=\"getallen[]\"><br>");
    }
    print_r("<input type=\"submit\" value=\"submit\">");
    print_r("</form>");
} else {
    header('Location: oef3.php');
}
