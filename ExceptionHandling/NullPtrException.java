package ExceptionHandling;
//import java.io.*;
//import java.lang.NullPointerException;
import java.util.Scanner;
public class NullPtrException 
{
  public static void main(String args[])
  {
	  
	  try 
	  {
		  String s=null;
		  s.charAt(0);
	  }
	 
      catch(Throwable e)
	  {
    	  System.out.println(e);
    	  System.out.println(e.getClass());
	  }
//	  catch(NullPointerException ne)
//	  {
//		  
//	  }
	  finally {
		  System.out.println("finally");
	  }
	 
  }
}
