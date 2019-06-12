<?php

$day = $_POST["day"];
$month = $_POST["month"];
$year = $_POST["year"];

require_once 'Util/Date.php';

$date = Date::make($day, $month, $year);

$date->printMonth();
