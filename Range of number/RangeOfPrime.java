import java.util.Scanner;
class RangeOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yhe first number");
		int a=sc.nextInt();
        System.out.println("Enter yhe second number");
		int b=sc.nextInt();
		printPrime(a,b);
	}
	public static void printPrime(int a,int b)
	{
		
		for(int i=a;i<=b;i++)
		{
			
			int j=2;
			for(;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.println(i);
			}
		}
	}
}
