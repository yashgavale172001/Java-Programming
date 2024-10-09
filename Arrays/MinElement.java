package Arrays;

public class MinElement 
{
	public static void main(String args[])
	{
		int ar[]= {2,4,1,7,5,99,32,11};
		  int min=Integer.MAX_VALUE;
		  
		  for(int i=0;i<ar.length;i++)
		  {
			  if(ar[i]<min)
			  {
				  min=ar[i];
			  }
		  }
		  System.out.println(min);
	}
  
}
