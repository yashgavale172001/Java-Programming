package ExceptionHandling;

public class NullPointer 
{
	
   public static void main(String args[])
   {
	  
	   try {
		   String s=null;
		   System.out.println(s.toString());
	   }
	   catch(NullPointerException np)
	   {
		   System.out.println("Dont invoke reference which has null value");
	   }
	   System.out.println("Thank you!..");
	   
	      }
}
