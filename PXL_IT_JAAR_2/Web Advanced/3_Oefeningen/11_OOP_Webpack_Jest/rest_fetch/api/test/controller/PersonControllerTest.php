<?php
use PHPUnit\Framework\TestCase;
use \controller\PersonController;

class PersonControllerTest extends TestCase
{

    public function setUp() : void
    {
        $this->personModel = $this->getMockBuilder('\model\PersonModel')
            ->disableOriginalConstructor()
			->getMock();
        $this->jsonPersonView = $this->getMockBuilder('\view\JsonPersonView')
            ->disableOriginalConstructor()
            ->getMock();
        $this->jsonPersonsView = $this->getMockBuilder('\view\JsonPersonsView')
            ->disableOriginalConstructor()
            ->getMock();
    }


    public function providerPersons()
    {
        return [['id'=>'1','name'=>'testname1'], ['id'=>'2','name'=>'testname2'],['id'=>'3','name'=>'testname3']];
    }


    /**
     * @dataProvider providerPersons
     **/
    public function testaddPersonById_validPerson_showPersonAndStatus201($id, $name){
		$person=['id'=>$id,'name'=>$name];
        $this->personModel->expects($this->atLeastOnce())
            ->method('addPersonByIdAndName')
            ->with( $this->equalTo($id), $this->equalTo($name))
            ->will($this->returnValue($person));

		$data=['person' => $person, 'statuscode' => 201];

        $this->jsonPersonView->expects($this->atLeastOnce())
            ->method('show')
            ->with($this->equalTo($data));
        $personController = new PersonController($this->personModel, $this->jsonPersonView, $this->jsonPersonsView);
        $personController->addPersonByIdAndName($id,$name);
    }


}
