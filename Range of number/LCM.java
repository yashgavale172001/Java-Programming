import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
        System.out.println("Enter the second number");
		int b=sc.nextInt();
		findLCM(a,b);
	}
	public static void findLCM(int a,int b)
	{
		int big=a>b?a:b;
        int i=1;
		while(true)
		{
			if((big*i)%a==0 && (big*i)%b==0)
			{
				System.out.println(big*i);
				break;
			}
			i++;

		}
	}
}
