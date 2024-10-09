package Arrays;
import java.util.Scanner;
public class DeclarePrint 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int arr[]= {10,43,12,98};
	  System.out.println("Enter the size of an array");
	  int a=sc.nextInt();
	  int arr1[]=new int[a];
	  System.out.println("Enter the numbers");
	  for(int i=0;i<arr1.length;i++)
	  {
		  arr1[i]=sc.nextInt();
	  }
	  
	  for(int i=0;i<arr1.length;i++)
	  {
		  System.out.println("number is :"+arr1[i]);
	  }
  }
}
