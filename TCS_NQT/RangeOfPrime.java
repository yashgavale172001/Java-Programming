package TCS_NQT;
import java.util.Scanner;
public class RangeOfPrime 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the starting range");
	  int n1=sc.nextInt();
	  System.out.println("Enter the ending range");
	  int n2=sc.nextInt();
	  Prime(n1,n2);
  }
  public static void Prime(int n1,int n2)
  {
	  for(int i=n1;i<=n2;i++)
	  {
		  boolean a=CheckPrime(i);
		  if(a)
		  {
			  System.out.println(i);
		  }
	  }
  }
  public static boolean CheckPrime(int n)
  {
	  boolean flag=false;
	  int i=2;
	  for(;i<=n/2;i++)
	  {
		  if(n%i==0)
		  {
			  //flag=false;
			  break;
		  }
	  }
	  if(i==(n/2)+1)
	  {
		  flag=true;
	  }
	  else {
		  flag=false;
	  }
	  return flag;
  }
}
