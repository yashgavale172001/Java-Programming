import java.util.Scanner;
class FactorPro 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int factor=1;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			sum+=i;
		}
		System.out.println("sum of digits of "+num+" are "+sum);
		for(int i=1;i<=num/2;i++ )
		{
			if(num%i==0)
			{
				factor*=i;
			}
		}
		System.out.println("product of digits of "+num+" are "+factor);
		if(sum==factor)
		{
			System.out.println("sum and products factors of "+num+" are same"+);
		}
		else{
			System.out.println("sum of digits of "+num+" are not equal");
		}
	}
}
