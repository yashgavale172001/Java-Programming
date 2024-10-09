package Abstraction;

public class CalculatorDriver 
{
   public static void main(String args[])
   {
	   Calculator d=new CalculatoriImp();
	  // d.message();  // child method cannot be accesible because of upcasting
	   d.add(10, 20);
	   d.divide(10, 20);
	   d.multiply(20, 3);
	   d.greetings();
	   Calculator.greetings();
	   
   }
}
