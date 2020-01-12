<?php

use tools\Broom;
use workers\Handyman;

require_once 'vendor/autoload.php';

$broom = new Broom();
$henry = new Handyman($broom);

$henry->work();
