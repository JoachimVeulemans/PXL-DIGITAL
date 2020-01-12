<?php

require_once("JsonWritable.php");

class Author implements JsonWritable
{
	private $id;
	private $name;
	private $books;

    /**
     * Author constructor.
     * @param $id
     * @param $name
     * @param $books
     */
    public function __construct($id, $name, $books)
    {
        $this->id = $id;
        $this->name = $name;
        $this->books = $books;
    }

    public function getJSONString()
    {
        $output = '{"id":' . $this->id . ',"name": "' . $this->name . '","books":[';

        foreach ($this->books as $key=>$book) {
            $output .= $book->getJSONString();
            if ($key !== sizeof($this->books) - 1) {
                $output .= ',';
            }
        }

        $output .= ']}';
        return $output;
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
    public function getName()
    {
        return $this->name;
    }

    /**
     * @param mixed $name
     */
    public function setName($name): void
    {
        $this->name = $name;
    }

    /**
     * @return mixed
     */
    public function getBooks()
    {
        return $this->books;
    }

    /**
     * @param mixed $books
     */
    public function setBooks($books): void
    {
        $this->books = $books;
    }

    /**
     * @param mixed $book
     */
    public function addBook($book): void
    {
        array_push($this->books, $book);
    }


}
