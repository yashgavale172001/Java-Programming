//buzz numbers
import java.util.Scanner;
class  BuzzNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if((num%10)==7 || num%7==0)
		{
			System.out.println("It is buzz number");
		}
		else{
			System.out.println("its not buzz number");
		}
	}
}
