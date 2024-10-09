package TCS_NQT;
import java.util.Scanner;
public class RangeOfStrong 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first range");
	  int n1=sc.nextInt();
	  System.out.println("Enter the last range");
	  int n2=sc.nextInt();
	  Range(n1,n2);
  }
  public static void Range(int n1,int n2)
  {
	  for(int i=n1;i<=n2;i++)
	  {
		  if(Strong(i))
		  {
			  System.out.println(i+" is Strong number");
		  }
//		  else {
//			  System.out.println(i+" is not Strong");
//		  }
	  }
  }
  public static boolean Strong(int n)
  {
	  int s=0;
	  int x=n;
	  while(n>0)
	  {
		  int last=n%10;
		  s+=Factor(last);
		  n/=10;
	  }
	  if(s==x)
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  public static int Factor(int n)
  {
	  int p=1;
	  for(int i=n;i>=1;i--)
	  {
		  p*=i;
	  }
	  return p;
  }
}
