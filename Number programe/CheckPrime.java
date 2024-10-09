import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i;
        for( i=2;i<(num/2);i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(i==(num/2))
		{
			System.out.println("its prime number");
		}
		else{
			System.out.println("its not prime number");
		}

	}
}
