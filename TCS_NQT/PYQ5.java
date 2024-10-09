package TCS_NQT;
import java.util.Scanner;
public class PYQ5 
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	findSum(n);
    }
    public static void findSum(int num)
    {
    	int n1=0,n2=1,n3,sum=0;
    	sum+=n1+n2;
    	for(int i=3;i<=num;i++)
    	{
    		n3=n1+n2;
    		sum+=n3;
    		n1=n2;
    		n2=n3;
    	}
    	System.out.println(sum);
    }
}
