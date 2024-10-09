import java.util.Scanner;
class printLeapYears 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start=sc.nextInt();
		System.out.println("Enter the end range");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++)
		{
			if((i%4==0 && i%100!=0) || (i%400==0))
			{
				System.out.println(i);
			}
		}
	}
}
