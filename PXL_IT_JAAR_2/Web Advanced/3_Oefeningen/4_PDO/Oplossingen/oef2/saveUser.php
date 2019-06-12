<?php

$user='root';
$password='root';
$pdo=null;
$database = 'PDO_OEF_2';

$id = $_POST["id"];
$data = $_POST["data"];

$query = "UPDATE werknemers SET ";

foreach ($data as $key => $value) {
    $query = $query . $key . " ='" . $value . "'";
    if ($value === end($data) && count($value) > 1) {
        $query = $query . ", ";
    }
}

$query = $query . " WHERE id = '" . $id . "'";

try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $numberRows = $pdo->exec($query);
    print("$numberRows rows modified");

} catch (PDOException $e) {
    print('Exception: ' . $e->getMessage());
}
$pdo = null;

?>

<script>
    setTimeout(() => {
        window.location = 'overzicht.php';
    }, 2000);
</script>
