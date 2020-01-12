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
        $pdo = new PDO('mysql:host=localhost;dbname=' . $database, $user, $password);
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $stmt = $pdo->query('SELECT DISTINCT name FROM ' . $table . ' WHERE name LIKE \'' . $name . '%\' ');
        $stmt->setFetchMode(PDO::FETCH_ASSOC);
        // http://php.net/manual/en/pdostatement.fetchall.php
        $result = $stmt->fetchAll();
        // http://php.net/manual/en/function.json-encode.php
        print(json_encode($result));
    } catch (PDOException $e) {
        print ('Exception!: ' . $e->getMessage());
    }
    $pdo = null;
}
