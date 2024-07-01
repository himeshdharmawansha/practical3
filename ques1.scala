

object reverse{

  def reverse(myString:String):String= {
      
    if(myString.length > 0)
    {
      var newString = reverse(myString.slice(1, myString.length)) + myString.charAt(0);
      return newString;
    }else
    {
      return "";
    }
  }

  def main(args:Array[String])={
    
      var myString = "Hey there";

      var reversedString  = reverse(myString);
      println("Original String : " + myString);
      println("Reversed String : " + reversedString);
  }
}
