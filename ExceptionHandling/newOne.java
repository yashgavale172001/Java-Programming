package ExceptionHandling;

public class newOne 
{
	public static int trykrr()
	{
		 try {
			  int a=100/0;
			  return 10;
			  //System.out.println("try");
		  }
		  catch(ArithmeticException ae)
		  {
			  //System.out.println();
			  return 20;
			 // System.out.println("catch");
		  }
		 finally {
			 System.out.println("finally");
	       //  return 30; 
			 // we know that at any cost finally block will execute,in this case 
			 //execution is =execution occurs at try then it will search for catch it goes into catch
			 //then there is return 20 is there ,so professionlally it needs to return 20 to main but we know that
			 //finally needs to exectue thats why it goes to the finally block instead of returning 20,
			 //after that in finally there is return 30,then it will return 30 to main method,
		 }
	}
  public static void main(String args[])
  {
	 System.out.println(trykrr());
  }
}
