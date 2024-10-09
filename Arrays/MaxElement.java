package Arrays;

public class MaxElement 
{
  public static void main(String args[])
  {
	  int ar[]= {1,2,3,4,54,6,7,8};
	  int max=Integer.MIN_VALUE;
	  
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]>max)
		  {
			  max=ar[i];
		  }
	  }
	  System.out.println(max);
  }
}
