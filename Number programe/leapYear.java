import java.util.Scanner;
class leapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("which year you want to check ");
		int year=sc.nextInt();
        if(year<1583)
		{
			System.out.println("This is gregorian calender ! it has starting year from 1583 ");
		}
		else if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("Its leap year");
		}
		else {
			System.out.println("its not leap year ");
		}
	}
}
