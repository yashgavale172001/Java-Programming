import java.util.Scanner;
class FactorOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
		{
			int rev=0;
			System.out.println("Its perfect number ");
            while(num1>0)
			{
				int l=num1%10;
				rev=rev*10+l;
				num1/=10;
			}
			if(rev==num)
			{
				System.out.println("given number is palindrome");
			}
			else
			{
				int sum2=0;
				while(num>0)
				{
					int l=num%10;
					sum2+=l;
					num/=10;
				}
				System.out.println("sum of digits are "+sum2);
			}
		}
		else
		{
			System.out.println("its not perfect number");
		}
	}
        
}

