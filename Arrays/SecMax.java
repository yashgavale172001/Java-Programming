package Arrays;

public class SecMax
{
  public static void main(String args[])
  {
	  int max=Integer.MIN_VALUE;
	  int secmax=Integer.MIN_VALUE;
	  int ar[]= {12,63,12,11,32,63,17};
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]>max)
		  {
			  secmax=max;
			  max=ar[i];
		  }
		  else if(ar[i]>secmax && ar[i]!=max)
		  {
			  secmax=ar[i];
		  }
	  }
	  System.out.println(max+" and "+secmax);
  }
}
