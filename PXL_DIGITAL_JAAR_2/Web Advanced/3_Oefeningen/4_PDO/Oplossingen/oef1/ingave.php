<!DOCTYPE html>
<html lang="en">
<?php
$user='root';
$password='root';
$database='persondb';
$pdo=null;
?>
<head>
    <meta charset="UTF-8">
    <title>Invoer</title>
</head>
<body>
<?php
$databases = [];
try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $statement = $pdo->prepare('SHOW DATABASES');
    $statement->setFetchMode(PDO::FETCH_ASSOC);
    $statement->execute();
    $databases = $statement->fetchAll();
} catch (PDOException $e) {
    print('Exception: ' . $e->getMessage());
}
$pdo = null;
?>
<form action="verwerking.php" method="post">
    <label for="database">Databank</label>
    <select id="database" name="database">
        <?php foreach($databases as $database) { ?>
            <option value="<?php echo $database["Database"]; ?>"><?php echo $database["Database"]; ?></option>
        <?php } ?>
    </select>
    <br>
    <label for="query">SQL-QUERY (drop, delete en truncate niet toegelaten)</label><br>
    <textarea id="query" style="width: 400px; height: 100px;" name="query"></textarea>
    <input type="submit" value="submit">
</form>
</body>
</html>