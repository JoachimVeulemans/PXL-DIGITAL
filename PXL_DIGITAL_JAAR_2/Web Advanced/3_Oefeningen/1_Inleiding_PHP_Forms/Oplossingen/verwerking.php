<?php

setcookie('name', $_POST["name"]);
setcookie('backgroundcolor', $_POST["backgroundcolor"]);

header('Location: toon.php');
