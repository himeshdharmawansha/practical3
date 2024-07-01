object stringList{

  def findSum(numbers:List[Int],sum:Int):Int = numbers match{
  
  	case Nil => sum;
  	
  	case head :: tail => 
  			if((head % 2) == 0) {
  				findSum(tail,sum + head);
  			}
  			else findSum(tail,sum);
  }

  def main(args:Array[String])={
    
      var numbers = List(2, 5, 6, 4, 3, 9, 12, 7, 8);
      
      var sum = 0;
      println(findSum(numbers,sum));
      
  }
}


