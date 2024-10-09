import java.util.Scanner;
class countLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int num1=sc.nextInt();
        System.out.println("Enter the ending range");
		int num2=sc.nextInt();
        int count=0;
		for(int i=num1;i<=num2;i++)
		{
			if(i<1583)
			{
				System.out.println("year might be greater than 1583 its gregorian calender! ");
			}
			if((i%4==0 && i%100!=0) || (i%400==0))
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total leap years  from "+num1+" and "+num2+" is "+count);
	}
}
