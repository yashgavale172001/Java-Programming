import java.util.Scanner;
class RangeOfStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
        range(a,b);

	}
	public static void range(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int sum=sumFactorial(i);
			if(i==sum)
			{
				System.out.println(i);
			}
		}
	}
	public static int sumFactorial(int a)
	{
		int s=0;
		while(a>0)
		{
			int rem=a%10;
			int f=facto(rem);
			s+=f;
			a/=10;
		}
		return s;
	}
	public static int facto(int a)
	{
		int s=1;
		while(a>0)
		{
			s*=a;
			a--;
		}
		return s;
	}
}
