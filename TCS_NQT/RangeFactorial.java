package TCS_NQT;
import java.util.Scanner;

public class RangeFactorial 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a fisrt range");
	  int n=sc.nextInt();
	  System.out.println("Enter a end range");
	  int n1=sc.nextInt();
	  Factorial(n,n1);
  }
  public static void  Factorial(int n1,int n2)
  {
	 // System.out.println("hi");
	  for(int i=n1;i<=n2;i++)
	  {
		  long sum=Factors(i);
		  System.out.println("Factorial of "+i+" is "+sum);
	  }
			  
  }
  public static long Factors(int n)
  {
	 // System.out.println("hi");
	  long s=1l;
	  for(int i=n;i>=1;i--)
	  {
		 // System.out.println("hi");
		  s*=i;
	  }
	  
	  return s;
	 
  }
}
