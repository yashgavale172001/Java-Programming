//if the element in an array is repeated greater than or equal to length/2 of array then print that elements
package TCS_NQT;
import java.util.Scanner;
import java.util.Arrays;
public class PYQ7 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the repeatation");
	  int n=sc.nextInt();
	  int arr[]= {2,4,2,4,2,4,5};
	  int mid=arr.length/2;
	  Findm(arr,mid);
  }
  public static void Findm(int arr[],int mid)
  {
	  int count[]=new int[arr.length];
	  
	 // int i=0;
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  int c=1;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j] && count[i]!=-1)
			  {
				  count[j]=-1;
				  c++;
				  count[i]=c;
			  }
			 else if(count[i]==1)
			 {
				 break;
			 }
		  }
		  if(count[i]!=-1 && c==1)
		  {
			  count[i]=c;
		  }
		   
	  }
	  
	 // System.out.println("h");
	  for(int k=0;k<count.length;k++)
	  {
		  if(count[k]!=-1 && count[k]>=mid)
		  {
			  System.out.println(arr[k]);
		  }
		  
	  }
  }
}
