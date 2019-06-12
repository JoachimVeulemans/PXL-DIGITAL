<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Oef3</title>
</head>
<body>


<form action="oef3verwerk.php" method="get">
    <label for="books">bookId:</label>
    <select id="books" name="books">
        <?php
        $id = $_GET["id"];
        $user='root';
        $password='root';
        $database = 'examen';

        try {
            $query = 'SELECT * from book';
            $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
            $statement = $pdo->prepare($query);
            $statement->setFetchMode(PDO::FETCH_ASSOC);
            $statement->execute();
            while (($row = $statement->fetch()) !== false) {
                echo '<option value="' . $row["id"] . '">' . $row["id"] . '</option>';
            }
        } catch (PDOException $e) {
            print('Exception: ' . $e->getMessage());
        }
        $pdo = null;

        ?>
    </select>
<input type="submit" value="delete"/>
</form>
</body>
</html>
