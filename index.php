<?php

// abstract class car{
// public $name ;

// public function __construct($fname){
//     $this->name = $fname ;
// }
// abstract public function intro ();
// }

//     class audi extends car{
//         public function intro(){
//             return "this is for audi :  $this->name" ;
//         }
//     }

//     class honda extends car {
//         public function intro(){
//         }
//         public function test(){
//             return "this is for honda :$this->name " ;
//         }
//     }

// $audi = new audi ("audi") ;
// echo  $audi->intro();
// echo "<br><br>" ;
// $honda = new honda ("honda");
// echo  $honda->test ();


abstract class parents{

abstract protected function prefixName($name);
}

    class childclass extends parents {
        public function prefixName($name, $greets = "dear")
    {   if ($name == "shadhin"){
            $prefixName = "Mr";
        }
        else if ($name == "mina"){
            $prefixName = "Mrs";
        }
        else {$prefixName = "";}
        return "$greets $prefixName $name" ;
                                        }
}
$class = new childclass ();
 echo $class->prefixName("shadhin");

echo "<br>";



trait test {
    public function msg (){
        echo "testing msg";
    }
}



class example{
    use test ;
}

$pov = new example ();
$pov->msg(); 







?>