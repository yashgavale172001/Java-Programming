package TCS_NQT;
import java.util.Scanner;

public class StrongNumber 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  if(CheckStrong(n))
	  {
		  System.out.println(n+" is Strong number");
	  }
	  else {
		  System.out.println(n+" is not strong number");
	  }
  }
  public static boolean CheckStrong(int n)
  {
	  int s=0;
	  int l=n;
	  while(n>0)
	  {
		  int last=n%10;
		  s+=Factorial(last);
		  n/=10;
	  }
	  if(l==s)
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  public static int Factorial(int n)
  {
	  int s=1;
	  for(int i=n;i>=1;i--)
	  {
		  s*=i;
	  }
	  return s;
  }
}
