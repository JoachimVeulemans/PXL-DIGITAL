<?php
use PHPUnit\Framework\TestCase;
use \model\PDOPersonModel;

class PDOPersonModelTest extends TestCase
{
    public function setUp() : void
    {
		$user = 'root';
		$password = 'root';
		$database = 'testpersondb';
		$server = 'localhost';
        $this->connection = new PDO("mysql:host=$server;dbname=$database", $user, $password);
        $this->connection->setAttribute(
            PDO::ATTR_ERRMODE,
            PDO::ERRMODE_EXCEPTION
        );
        $this->connection->exec('DROP TABLE IF EXISTS persons');
        $this->connection->exec('CREATE TABLE persons (
                        id INT, 
                        name VARCHAR(255),
                        PRIMARY KEY (id)
                   )');

        $persons=$this->providerPersons();
        foreach($persons as $person){
            $this->connection->exec("INSERT INTO persons (id, name) VALUES (".$person['id'].",'".$person['name']."');");
        }
    }

    public function tearDown() : void
    {
        $this->connection = null;
    }

    public function providerPersons()
    {
        return [['id'=>'1','name'=>'testname1'], ['id'=>'2','name'=>'testname2'],['id'=>'3','name'=>'testname3']];
    }

    public function providervalidExistingIds()
    {
        return [['1'], ['2'], ['3']];
    }

    public function providervalidUnexistingIds()
    {
        return [['4'], ['100']];
    }


    public function providervalidIds()
    {
        return [['1'], ['2'], ['3'],['100'],['1000']];
    }

    public function providerInvalidIds()
    {
        return [['0'], ['-1'], ['1.2'], ["aaa"], [12], [1.2]];
    }

    public function providerValidNames()
    {
        return [['aa'], ['Aa'], ['aaa'], ['aa11']];
    }

    public function providerInvalidNames()
    {
        return [[''], ['A'], [1.2], [12]];
    }



    public function testListPersons_personsInDatabase_ArrayPersons()
    {
        $personModel = new PDOPersonModel($this->connection);
        $actualPersons = $personModel->listPersons();
        $expectedPersons=$this->providerPersons();
        $this->assertEquals('array',gettype($actualPersons));
        $this->assertEquals(count($expectedPersons)  ,count($actualPersons));
        foreach($actualPersons as $actualPerson  ){
            $this->assertContains($actualPerson, $expectedPersons);
        }
    }

    public function testListPersons_noPersonsInDatabase_EmptyArray()
    {
        $this->connection->exec('DROP TABLE persons');

        $this->connection->exec('CREATE TABLE persons (
                        id INT, 
                        name VARCHAR(255),
                        PRIMARY KEY (id)
                   )');

        $personModel = new PDOPersonModel($this->connection);
        $actualPersons = $personModel->listPersons();
        $this->assertEquals('array',gettype($actualPersons));
        $this->assertEquals(0,count($actualPersons));
    }

    /**
     * @expectedException \PDOException
     **/
    public function testListPersons_noTablePersons_PDOException()
    {
        $this->connection->exec('DROP TABLE persons');
        $personModel = new PDOPersonModel($this->connection);
        $personModel->listPersons();
    }

    /**
     * @expectedException \InvalidArgumentException
     * @dataProvider providerInvalidIds
     **/
    public function testIdExists_invalidId_InvalidArgumentException($id)
    {
        $personModel = new PDOPersonModel($this->connection);
        $actual=$personModel->idExists($id);
    }

    /**
     * @dataProvider providerValidExistingIds
     **/

    public function testIdExists_existingId_True($id)
    {
        $personModel = new PDOPersonModel($this->connection);
        $this->assertTrue($personModel->idExists($id));
    }


    /**
     * @dataProvider providerValidUnexistingIds
     **/
    public function testIdExists_unexistingId_False($id)
    {
        $personModel = new PDOPersonModel($this->connection);
        $this->assertFalse($personModel->idExists($id));
    }

}
