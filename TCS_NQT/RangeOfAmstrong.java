package TCS_NQT;
import java.util.Scanner;
import java.lang.Math;
public class RangeOfAmstrong 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the starting number");
	  int n1=sc.nextInt();
	  System.out.println("Enter the ending range");
	  int n2=sc.nextInt();
	  Range(n1,n2);
  }
  public static void Range(int n1,int n2)
  {
	  for(int i=n1;i<=n2;i++)
	  {
		  if(Amstrong(i))
		  {
			  System.out.print(i+" ");
		  }
	  }
  }
  public static boolean Amstrong(int n)
  {
	  int c=count(n);
	  int sum=0;
	  int l=n;
	  while(n>0)
	  {
		  sum+=Math.pow(n%10, c);
		  n/=10;
	  }
	  if(l==sum)
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
