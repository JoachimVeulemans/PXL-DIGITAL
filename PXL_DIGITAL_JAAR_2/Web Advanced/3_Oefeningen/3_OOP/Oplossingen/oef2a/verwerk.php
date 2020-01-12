<?php

$day = $_POST["day"];
$month = $_POST["month"];
$year = $_POST["year"];

require_once 'Util/Date.php';

$date = new Date($day, $month, $year);

$date->printMonth();
