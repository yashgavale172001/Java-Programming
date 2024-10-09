package ExceptionHandling;

public class TrialBasics 
{
  public static void main(String args[])
  {
	  try {
		  int n=10/0;
	  }
	  catch(ArithmeticException np)
	  {
		  System.out.println("Dont divide by zero");
	  }
//	  catch(NullPointerException np)
//	  {
//		  System.out.println("Dont divide by zero");
//	  }
	  finally {
		  System.out.println("Finally");
	  }
	  System.out.println("Ho raha he");
  }
}
