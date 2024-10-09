import java.util.Scanner;
class  CoPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		findCoPrime(a,b);

	}
	public static void findCoPrime(int a,int b)
	{
		int s=a<b?a:b;
        int i=s;
		for(;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				break;
			}
		}
		if(i==1)
		{
			System.out.println("these are co prime numbers");
		}
		else{
			System.out.println("these are not co prime numbers");
		}
	}
}
