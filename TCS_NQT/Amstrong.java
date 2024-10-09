package TCS_NQT;
import java.util.Scanner;
import java.lang.Math;
public class Amstrong 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  if(Anstrong(n))
	  {
		  System.out.println(n+" Is amstrong number");
	  }
	  else {
		  System.out.println("Its not amstrong number");
	  }
	  
  }
  public static boolean Anstrong(int n)
  {
	  int c=count(n);
	  //System.out.println(c);
	  int sum=0;
	  int l=n;
	  while(n>0)
	  {
		  sum+=Math.pow(n%10,c);
		  n/=10;
	  }
	  if(sum==l)
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  public static int count(int n)
  {
	  int sum=0;
	  while(n>0)
	  {
		  sum++;
		  n/=10;
	  }
	  return sum;
  }
}
