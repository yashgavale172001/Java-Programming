// check if nth given fibonacci number is prime or not
import java.util.Scanner;
class  FiboPrimeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		for(int i=2;i<=num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(num+" th fibonacci number is "+n1);
		int i;
		for(i=2;i<=(n1/2);i++)
		{
			break;
		}
		if(i-1==(n1/2))
		{
			System.out.println(num+" th fibonacci number "+n1+" is prime");
		}
		else{
			System.out.println(num+" th fibonacci number "+n1+" is not prime");
		}
	}
}
