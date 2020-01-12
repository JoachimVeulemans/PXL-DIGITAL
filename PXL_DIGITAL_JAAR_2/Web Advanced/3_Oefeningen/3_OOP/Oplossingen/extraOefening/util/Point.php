<?php

class Point {
    private $x;
    private $y;

    public function __construct($x, $y)
    {
        $this->x = $x;
        $this->y = $y;
    }

    public function print() {
        print_r("(".$this->x.",".$this->y.")");
    }
}