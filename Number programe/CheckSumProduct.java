import java.util.Scanner;
class CheckSumProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int res=num;
		int res1=num;
		int sum=0;
		int prod=1;
		
		while(num>0)
		{
			int l=num%10;
			sum=sum+l;
			num/=10;
		}
		System.out.println("sum of digits are "+sum);
		while(res1>0)
		{
			int p=res1%10;
			prod=prod*p;
			res1/=10;
		}
		System.out.println("product of digits are "+prod);
		if(sum==prod)
		{
			System.out.println("Sum and product of "+res+ " are same");
		}
		else{
			System.out.println("sum and product of "+res+" is not same");
		}
	}
}
