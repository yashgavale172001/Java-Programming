package TCS_NQT;
import java.util.Scanner;
/*Given an array of size N-1 with integers in the range of [1,N], the task is to find the missing number from the first N integers.

Example 1:

Input: 4

1 2 3 5

Output: 4

Example 2:

Input: 3

1 2 4

Output: 3*/
public class PYQ13 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  double n=sc.nextInt();
	  int ar[]=new int[(int)n];
	 // double n=4;
	  double num1=n+1;
//	  int ar[]= {1,2,3,5};
	  int s=0;
	  for(int i=0;i<ar.length;i++)
	  {
		  ar[i]=sc.nextInt();
		  s+=ar[i];
	  }
	  double num=(num1/2)*(2*1+n*1);
	  System.out.println((int)(num-s));
  }
}
