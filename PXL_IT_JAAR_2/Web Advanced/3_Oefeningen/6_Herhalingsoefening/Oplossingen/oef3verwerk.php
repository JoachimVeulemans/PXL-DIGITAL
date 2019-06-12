<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Oef3verwerk</title>
</head>
<body>
<?php
$bookId = $_GET['books'];

$user='root';
$password='root';
$pdo=null;
$database = 'examen';

$query = "DELETE FROM book WHERE id = '" . $bookId . "'";

try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $numberRows = $pdo->exec($query);
    if ($numberRows === 1) {
        print("Het boek is succesvol verwijderd!");
    } else {
        print("Er trad een fout op!");
    }
} catch (PDOException $e) {
    print('Exception: ' . $e->getMessage());
}
$pdo = null;
?>
</body>
</html>
