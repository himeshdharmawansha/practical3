

object Average{

	def average(num1:Int, num2:Int): Double = {
		
		var mean = (num1 + num2)/ 2.0;
		return BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;
	}		
	
	def main(args: Array[String]) = {
	
	   var num1 = 10;
	   var num2 = 13;
	   
	   var mean = average(num1, num2);
	   println("The mean of " + num1 + " and " + num2 + f" : ${mean}%.2f");
	   }
}
