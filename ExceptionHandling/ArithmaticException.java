package ExceptionHandling;
import java.util.Scanner;
public class ArithmaticException 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 1st num");
	  int n1=sc.nextInt();
	  System.out.println("Enter 2nd num");
	  int n2=sc.nextInt();
	  
	  try {
		  int n3=n1/n2;
	  }
	  catch(ArithmeticException ae)
	  {
		  System.out.println("Caught successfully");
	  }
	  //System.out.println("hehehe");
	  finally {
		  System.out.println("Finally");
	  }
  }
}
