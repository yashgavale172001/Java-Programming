import java.util.Scanner;
class Q6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your data");
		double var=sc.nextDouble();
		System.out.println("in which formate you want data");
		System.out.println("1. byte \n 2.short \n 3.char \n 4.int \n 5.long \n 6.float \n 7.double");
		int i=sc.nextInt();
		switch(i)
		{
			    case 1:
				{
				   System.out.println("Your data in byte is "+(byte)var);
				   break;
			    }
				case 2:
				{
				   System.out.println("Your data in short is "+(short)var);
				   break;
			    }
				case 3:
				{
				   System.out.println("Your data in char is "+(char)var);
				   break;
			    }
				case 4:
				{
				   System.out.println("Your data in int is "+(int)var);
				   break;
			    }
				case 5:
				{
				   System.out.println("Your data in long is "+(long)var);
				   break;
			    }
				case 6:
				{
				   System.out.println("Your data in float is "+(float)var);
				   break;
			    }
				case 7:
				{
				   System.out.println("Your data in double is "+(double)var);
				   break;
			    }
			default:
			{
				System.out.println("You entered wrong number");
			}

		}
	}
}

