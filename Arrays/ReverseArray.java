package Arrays;

public class ReverseArray 
{
  public static void main(String args[])
  {
	  int ar[]= {1,2,3,4,5,6,8,9,7};
	  
	  for(int i=0;i<ar.length;i++) 
	  {
		  if(i<(ar.length/2))
		  {
			  int temp=ar[i];
			  ar[i]=ar[ar.length-i-1];
			  ar[ar.length-i-1]=temp;
		  }
		  else {
			  break;
		  }
		  
	  }
	 // System.out.println(Arrays.toString(ar));
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
  }
}
