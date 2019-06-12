<?php
namespace view;

class JsonPersonView implements View
{
    public function show(array $data)
    {
        header('Content-Type: application/json');
        http_response_code($data['statuscode']);
        $person = $data['person'];
        print(json_encode($person));
    }
}
