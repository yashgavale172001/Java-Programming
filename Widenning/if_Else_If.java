
import java.util.Scanner;
class if_Else_If 
{
	public static void main(String[] args) 
	{
	    /*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin: ");
		int pin=sc.nextInt();
		if(pin==12345)
		{
			System.out.println("Entered pin is correct ");
		}
		else{
			System.out.println("You entered wrong pin");
		}*/

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();

		if(num%2==0)
		{
			System.out.println(num + " is even");
		}
		else{
			System.out.println(num+" is odd");
		}*/

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println(num+" is neutral");
		}
		else if(num==-0){
			System.out.println(num+" is negative");
		}
		else{
			System.out.println(num+" is positive");
		}


	}
} 
