<?php

$user='root';
$password='root';
$pdo=null;
$database = 'PDO_OEF_2';

$id = $_POST["id"];
$name = $_POST["name"];

$query = "INSERT INTO werknemers(`id`, `name`) VALUES (" . $id . ",'" . $name . "')";

try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $numberRows = $pdo->exec($query);
    if ($numberRows === 1) {
        print("De gebruiker is succesvol toegevoegd!");
    } else {
        print("Er trad een fout op!");
    }
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
