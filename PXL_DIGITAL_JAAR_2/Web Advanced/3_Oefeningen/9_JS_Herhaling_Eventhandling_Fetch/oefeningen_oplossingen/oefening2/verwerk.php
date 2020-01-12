<?php
header('Content-Type: application/json');

$name = $_GET['name'];
$user = 'root';
$password = 'root';
$database = 'oef1';
$table = 'name';


if ($name != '') {
    $pdo = null;
    try {
        $pdo = new PDO('mysql:host=localhost;dbname='.$database, $user, $password);
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $stmt = $pdo->exec('DELETE name FROM ' . $table . ' WHERE name =\'' . $name . '\' ');
    } catch (PDOException $e) {
        print ('Exception!: ' . $e->getMessage());
    }
    $pdo = null;
}
