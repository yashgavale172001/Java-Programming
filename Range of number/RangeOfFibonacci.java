import java.util.Scanner;
class  RangeOfFibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
        rangeFibo(a,b);
	}
	public static void rangeFibo(int a,int b)
	{
		int n1=0;
		int n2=1;
		int n3;
		for(int i=a;i<=b;i++)
		{
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}
}
