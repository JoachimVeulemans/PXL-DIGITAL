<?php

class Color {
    public static $BLACK;
    public static $WHITE;
    public static $RED;
    public static $GREEN;
    public static $BLUE;
    public static $YELLOW;
    private $rgb;

    public function __construct($rgb)
    {
        $this->rgb = $rgb;
    }

    public function getRgb()
    {
        return $this->rgb;
    }

    public function __toString()
    {
        return dechex($this->rgb);
    }
}

Color::$BLACK = new Color(0x000000);
Color::$WHITE = new Color(0xFFFFFF);
Color::$RED = new Color(0xFF0000);
Color::$GREEN = new Color(0xFF00FF);
Color::$BLUE = new Color(0x0000FF);
Color::$YELLOW = new Color(0xFFFF00);
