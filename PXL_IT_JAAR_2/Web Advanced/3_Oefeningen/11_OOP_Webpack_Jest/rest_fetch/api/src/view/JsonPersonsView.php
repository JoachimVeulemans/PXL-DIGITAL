<?php
namespace view;

class JsonPersonsView implements View
{
    public function show(array $data)
    {
        header('Content-Type: application/json');
        http_response_code($data['statuscode']);
        $persons = $data['persons'];
        print(json_encode($persons));
    }
}
