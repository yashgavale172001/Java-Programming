//check whether number contains all fibonacci  numbers or not
import java.util.Scanner;
class  CheckNumbersFibo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//nboolean b=false;
		while(num>0)
		{
			int l=num%10;
			if(l!=0 && l!=1 && l!=2 && l!=3 && l!=5 && l!=8)
			{
				break;
			}
			num/=10;
		}
		if(num==0)
		{
			System.out.println("all digits are in fibonacci series");
		}
		else{
			System.out.println("all digits are not in fibonacci series");
		}
	}
}
