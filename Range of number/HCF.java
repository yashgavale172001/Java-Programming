import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		hcf(n1,n2);

	}
	public static void hcf(int a,int b)
	{
		int small=a<b?a:b;
		//System.out.println(small);
		for(int i=small;i>=1;i--)
		{
			//System.out.println(small);
			if(a%i==0 && b%i==0)
			{
				System.out.println("Highest common factor is: "+i);
				break;
			}
		}
	}
}
