package Interface;

public class CalculatorDriver 
{
  public static void main(String args[])
  {
	  Calculator c=new CalculatorImp();
	  c.add(10,20);
	  c.divide(15, 3.1234);
	 System.out.println(c.multiply(10.2345, 23.123)); 
	  //c.trying();       //we cannot access it 
	  Calculator.trying();
	  //c.message();
	  
  }
}
