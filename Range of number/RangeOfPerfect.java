import java.util.Scanner; 
class  RangeOfPerfect
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
        System.out.println("Enter the first number");
		int b=sc.nextInt();
        range(a,b);
	    
	}
	public static void range(int a,int b)
	{
		for(int i=1;i<=b;i++)
		{
			checkFactor(i);
		}
	}
	public static void checkFactor(int a)
	{
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum+=i;
			}
		}
		if(sum==a)
		{
			System.out.println(a);
		}
	}
}
