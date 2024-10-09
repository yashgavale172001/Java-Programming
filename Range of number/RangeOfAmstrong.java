import java.util.Scanner;
class RangeOfAmstrong
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the secong number");
		int b=sc.nextInt();
		rangeOfAmstrong(a,b);

	}
	public static void rangeOfAmstrong(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int count=countNums(i);
			int x=i;
			int sum=0;
			while(x>0)
			{
				sum+=power(x%10,count);
				x/=10;
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}
	}
	public static int countNums(int a)
	{
		int sum=0;
		while(a>0)
		{
			sum++;
			a/=10;
		}
		return sum;
	}
	public static int power(int a,int count)
	{
		int sum=1;
		for(int i=1;i<=count;i++)
		{
			sum*=a;
		}
		return sum;
	}
}
