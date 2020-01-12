<?php namespace textnode;
class TextNode
{
    private $nextNode;
    private $text;
    private function __construct($text)
    {
        $this->nextNode = null;
        $this->text = $text;
    }
    public static function makeNode($text)
    {
        return new TextNode($text);
    }
    // de functie addNode voegt een TextNode toe op het einde van
    //een keten van nodes
    public function addNode($text)
    {
        // kijk of nextNode gelijk is aan null
        // indien ja: maak een nieuwe node aan en ken die toe aan
        //nextNode
        if($this->nextNode == null){
            $this->nextNode = self::makeNode($text);
        }
        else{
            // indien nee: roep de methode addNode aan op nextNode
            $this->nextNode->addNode($text);
        }
    }
    public function printAll()
    {
        print($this->text);
        if($this->nextNode !=null){
            $this->nextNode->printAll();
        }
    }

    public function printTextNodeAt($i) {
        if ($i < 0) {
            throw new \Exception("De parameter is kleiner dan 0.");
        }
         $nodeToPrint = $this;
         for ($count = 0; $count < $i; $count++) {
             if ($nodeToPrint->nextNode == null) {
                 throw new \Exception("De parameter is groter dan het aantal nodes");
             }
             $nodeToPrint = $nodeToPrint->nextNode;
         }
         print_r($nodeToPrint->text);
    }
}
