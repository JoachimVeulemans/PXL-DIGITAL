<?php

$user='root';
$password='root';
$pdo=null;

$database = $_POST["database"];
$query = $_POST["query"];

if (stristr(strtolower($query), 'drop') !== false ||
    stristr(strtolower($query), 'delete') !== false ||
    stristr(strtolower($query), 'truncate') !== false) {
    print("De SQL-QEURY bevatte drop, delete of truncate. Deze zijn niet toegelaten!");
} else {
    print("query = " . $query);
    print("<br>");
    print("databank = " . $database);
    print("<br>");

    try {
        $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
        $statement = $pdo->prepare($query);
        $statement->setFetchMode(PDO::FETCH_ASSOC);
        $statement->execute();
        while (($row = $statement->fetch()) !== false) {
            foreach ($row as $column) {
                print($column . "\t");
            }
            print("<br>");
        }
    } catch (PDOException $e) {
        print('Exception: ' . $e->getMessage());
    }
    $pdo = null;
}