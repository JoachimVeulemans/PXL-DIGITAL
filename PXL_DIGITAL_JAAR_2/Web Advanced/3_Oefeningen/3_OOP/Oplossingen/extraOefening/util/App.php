<?php

require_once 'Color.php';
require_once 'ColouredPoint.php';

$point = ColouredPoint::make(1,2, Color::RED);
$point->print();