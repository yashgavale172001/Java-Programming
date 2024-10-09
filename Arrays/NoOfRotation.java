package Arrays;
import java.util.Scanner;
public class NoOfRotation 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int arr[]= {10,20,30,40,50};
	  for(int i=0;i<a;i++)
	  {
		  int j=arr.length-1;
		  int temp=arr[arr.length-1];
		  for(;j>0;j--)
		  {
			  arr[j]=arr[j-1];
		  }
		  arr[j]=temp;
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
  }
}
