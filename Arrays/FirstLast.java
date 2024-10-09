package Arrays;
import java.util.Scanner;
public class FirstLast 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of array");
	  int a=sc.nextInt();
	  int ar[]=new int[a];
	  
	  System.out.println("Enter the elements in an array");
	  for(int i=0;i<ar.length;i++)
	  {
		  ar[i]=sc.nextInt();
	  }
	  
	  System.out.println("First last sequence");
	  for(int i=0;i<=(ar.length/2);i++)
	  {
		  System.out.println(ar[i]);
		  System.out.println(ar[ar.length-i-1]);
	  }
  }
}
