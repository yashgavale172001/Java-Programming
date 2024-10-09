import java.util.Scanner;
class evenLeapYears 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int num1=sc.nextInt();
		System.out.println("Enter the ending range");
		int num2=sc.nextInt();
        
		for(int i=num1;i<=num2;i++)
		{
			if(i<1583)
			{
				System.out.println("this is gregorian calender which starts from 1583 !");
			}
			else if(((i%4==0 && i%100!=0) || (i%400==0)) && (i%2==0))
			{
				System.out.println(i);
			}
		}
	}
}
