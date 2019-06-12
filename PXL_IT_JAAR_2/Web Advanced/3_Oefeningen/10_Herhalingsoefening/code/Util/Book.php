<?php

require_once("JsonWritable.php");

class Book implements JsonWritable
{
	private $id;
	private $title;

	public function __construct($id,$title){
        $this->id = $id;
        $this->title = $title;
	}

	public function getJSONString(){
        return '{"id":' . $this->id . ', "title": "' . $this->title . '"}';
    }

    /**
     * @return mixed
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @param mixed $id
     */
    public function setId($id): void
    {
        $this->id = $id;
    }

    /**
     * @return mixed
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * @param mixed $title
     */
    public function setTitle($title): void
    {
        $this->title = $title;
    }


}
