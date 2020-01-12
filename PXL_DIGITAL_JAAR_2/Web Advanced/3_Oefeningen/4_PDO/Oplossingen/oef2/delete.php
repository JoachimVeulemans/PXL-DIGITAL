<?php

$user='root';
$password='root';
$pdo=null;
$database = 'PDO_OEF_2';

$id = $_POST["user"];

$query = "DELETE FROM werknemers WHERE id = '" . $id . "'";

try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $numberRows = $pdo->exec($query);
    if ($numberRows === 1) {
        print("De gebruiker is succesvol verwijderd!");
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


