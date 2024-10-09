import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		check(num);

	}
	public static void check(int num)
	{
		int n=num;
		while(true)
		{
			int s=sqSum(n);
			n=s;
			if(s==1)
			{
				System.out.println("Its Happy Number");
				break;
			}
			if(s==4)
			{
				System.out.println("Its Unhappy number");
				break;
			}
		}
	}
	public static int sqSum(int num)
	{
		int s=0;
		while(num>0)
		{
			int last=num%10;
			int sq=last*last;
			s+=sq;
			num/=10;
		}
		return s;
	}
}
