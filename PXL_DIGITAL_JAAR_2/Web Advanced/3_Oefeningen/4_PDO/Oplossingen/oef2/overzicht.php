<?php

$user='root';
$password='root';
$pdo=null;
$database = 'PDO_OEF_2';
$query = 'SELECT * FROM werknemers';
$persons = [];
$ids = [];

try {
    $pdo = new PDO("mysql:host=localhost;dbname=$database", $user, $password);
    $statement = $pdo->prepare($query);
    $statement->setFetchMode(PDO::FETCH_ASSOC);
    $statement->execute();
    while (($row = $statement->fetch()) !== false) {
        array_push($persons, $row["name"]);
        array_push($ids, $row["id"]);
    }
} catch (PDOException $e) {
    print('Exception: ' . $e->getMessage());
}
$pdo = null;

?>
<script type="text/javascript">
    function submitForm(action) {
        var form = document.getElementById('users');
        form.action = action;
        form.submit();
    }
    function submitDeleteForm(action) {
        var form = document.getElementById('users');
        form.action = action;

        if (confirm("Weet u zeker dat u deze gebruiker wilt verwijderen?")) {
            form.submit();
        }

    }
</script>
<form method="post" id="users">
    <input type="hidden" id="id" name="id" value="">
    <label for="users">Gebruikers:</label>
    <select id="user" name="user">
        <?php foreach($persons as $person => $key) { ?>
            <option value="<?php echo $ids[$person]; ?>"><?php echo $key; ?></option>
        <?php } ?>
    </select>
    <button type="button" onclick="submitDeleteForm('delete.php')">Verwijderen</button>
    <button type="button" onclick="submitForm('alter.php')">Aanpassen</button>
    <button type="button" onclick="submitForm('add.php')">Toevoegen</button>
</form>
