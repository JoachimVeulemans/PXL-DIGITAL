<?php

$user='root';
$password='root';
$pdo=null;
$database = 'PDO_OEF_2';

$id = $_POST["user"];

?>
<form method="post" id="user" action="saveUser.php">

<?php
try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $statement = $pdo->prepare("SELECT * FROM werknemers WHERE id = '$id'");
    $statement->setFetchMode(PDO::FETCH_ASSOC);
    $statement->execute();
    while (($row = $statement->fetch()) !== false) {
        foreach ($row as $column => $value) {
            if ($column !== "id") {
                print("<input name='data[" . $column . "]' value='" . $value . "'></input>");
            } else {
                print("<input type='hidden' name='" . $column . "' value='" . $value . "'></input>");
            }
        }
        print("<br>");
    }
} catch (PDOException $e) {
    print('Exception: ' . $e->getMessage());
}
$pdo = null;

?>

    <button type="submit">Aanpassen</button>
</form>
