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

//        $statement = $this->pdo->prepare('INSERT into persons(id,name) VALUES (:id,:name) ON DUPLICATE KEY UPDATE id=:id, name=:name');
//        $statement->bindParam(':id', $id, \PDO::PARAM_INT);
//        $statement->bindParam(':name', $name, \PDO::PARAM_STR);
//        $statement->execute();

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
