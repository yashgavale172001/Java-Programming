package TCS_NQT;
import java.util.Scanner;
//given an array and an integer k we need to find the maximum element in the each of the contigious subarrays
public class PYQ4 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the sub array length");
	 int n=sc.nextInt();
	 int arr[]= {2,4,7,1,6,3};
	 findmax(arr,n);
  }
  public static void findmax(int arr[],int n)
  {
	  for(int i=0;i<arr.length;i++)
	  {
		  int max=Integer.MIN_VALUE;
		  int k=i;
		  if(k<arr.length-(n-1))
		  {
			  for(int j=1;j<=n;j++)
			  {
				  if(arr[k]>max)
				  {
					  max=arr[k++];
				  }
			  }
			  System.out.println(max);
		  }
		  
	  }
  }
}
