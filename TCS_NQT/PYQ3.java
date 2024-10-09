package TCS_NQT;
import java.util.Scanner;
//given an integer ,we need to find the sum of values of that table ip=10 op=550

public class PYQ3 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(SumTable(n));
	  
  }
  public static int SumTable(int n)
  {
	  int s=0;
	  for(int i=1;i<=10;i++)
	  {
		  s=s+i*n;
	  }
	  return s;
  }
}
