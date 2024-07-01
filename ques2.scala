

object stringList{

  def filter(stringList:List[String]):List[String] = stringList match {
  
  	case Nil => Nil;
  	
  	case head :: tail => 
  			if(head.length > 5) head :: filter(tail)
  			else filter(tail)
  }

  def main(args:Array[String])={
    
      var stringList = List("Apple","Banana","Pineapple","Mango","Orange");
      
      var newList = filter(stringList);
      
      println(newList);
  }
}
