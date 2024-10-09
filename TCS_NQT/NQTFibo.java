package TCS_NQT;
import java.util.Scanner;
public class NQTFibo 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the range");
	  int n=sc.nextInt();
	  Fibo(n);
  }
  public static void Fibo(int n)
  {
	  int n1=0,n2=1,n3;
	  System.out.print(n1+" ");
	  System.out.print(n2+" ");
	  for(int i=2;i<n;i++)
	  {
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		  System.out.print(n3+" ");
	  }
  }
}
