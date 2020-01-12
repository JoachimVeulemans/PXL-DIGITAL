<?php

class Date {
    public $day = 0;
    public $month;
    public $year;
    private static $MONTHS = ["Januari", "Februari", "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "Oktober", "November", "December"];

    function __construct($day = 1, $month = 1, $year = 2008)
    {
        if ($day < 1 || $day > 31) {
            throw new \DateException("De dag is niet geldig");
        }
        $this->day = $day;
        if ($month < 1 || $month > 12) {
            throw new \DateException("De maand is niet geldig");
        }
        $this->month = $month;
        if ($year < 1) {
            throw new \DateException("Het jaar is niet geldig");
        }
        $this->year = $year;
    }

    function print() {
        print_r($this->day."/".$this->month."/".$this->year);
    }

    function printMonth() {
        print_r($this->day."/".Date::$MONTHS[$this->month]."/".$this->year);
    }

    /**
     * @return int
     */
    public function getDay(): int
    {
        return $this->day;
    }

    /**
     * @param int $day
     */
    public function setDay(int $day): void
    {
        $this->day = $day;
    }

    /**
     * @return int
     */
    public function getMonth(): int
    {
        return $this->month;
    }

    /**
     * @param int $month
     */
    public function setMonth(int $month): void
    {
        $this->month = $month;
    }

    /**
     * @return int
     */
    public function getYear(): int
    {
        return $this->year;
    }

    /**
     * @param int $year
     */
    public function setYear(int $year): void
    {
        $this->year = $year;
    }

}