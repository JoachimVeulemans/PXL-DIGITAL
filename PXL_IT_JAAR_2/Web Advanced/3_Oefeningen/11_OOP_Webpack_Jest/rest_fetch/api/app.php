<?php
require "vendor/autoload.php";


use model\PDOPersonModel;
use view\JsonPersonView;
use view\JsonPersonsView;
use controller\PersonController;

$user = 'root';
$password = 'root';
$database = 'persondb';
$server = 'localhost';
$pdo = null;

$pdo = new PDO("mysql:host=$server;dbname=$database", $user, $password);
$pdo->setAttribute(
    PDO::ATTR_ERRMODE,
    PDO::ERRMODE_EXCEPTION
);

$personModel = new PDOPersonModel($pdo);


$jsonPersonView = new JsonPersonView();
$jsonPersonsView = new JsonPersonsView();
$personController = new PersonController($personModel, $jsonPersonView,$jsonPersonsView);


$router = new AltoRouter();
$router->setBasePath('/api/');

$router->map(
    'GET',
    'persons/',
    function () use ($personController) {
        $personController->listPersons();
    }
);

$router->map(
    'PUT',
    'persons/[i:id]',
    function ($id) use ($personController) {
        $entityBody = file_get_contents('php://input','r');
        $json = json_decode($entityBody);
        $name=null;
        if(isset($json->name)) {
            $name = $json->name;
        }
        $personController->addPersonByIdAndName($id,$name);
    }
);


$match = $router->match();
if ($match && is_callable($match['target'])) {
    call_user_func_array($match['target'], $match['params']);
} else {
    http_response_code(400);
}
