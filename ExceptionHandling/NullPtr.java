package ExceptionHandling;



public class NullPtr
{
	public void a()
	{
		
	}
   public static void main(String args[])
   {
	  
     try {
    	 NullPtr np=null;
  	   np.a();
     }
     catch(NullPointerException np)
     {
    	 System.out.println("Dont invoke reference with null value");
     }
     System.out.println("Thank god");
	   
	   
   }
}

