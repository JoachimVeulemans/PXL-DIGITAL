<?php

class ColouredPoint {

    private $point;
    private $color;

    private function __construct($x, $y, $color)
    {
        $this->point = new Point($x, $y);
        $this->color = $color;
    }

    public static function make($x, $y, $color) {
        return new ColouredPoint($x, $y, $color);
    }

    public function print() {
        $this->point->print();
        print_r($this->color);
    }
}