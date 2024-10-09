package Arrays;

public class FINDLNGTH 
{
  public static void main(String args[])
  {
	  int ar[]= {1,2,3,4,5,6,7,8};
	  int c=0;
	  try {
		  for(int i=0;;i++)
		  { 
			  ar[i]=ar[i];
			  c++;
		  }
	  }
	  catch(ArrayIndexOutOfBoundsException ae)
	  {
		  System.out.println(c);
	  }
	  
  }
}
