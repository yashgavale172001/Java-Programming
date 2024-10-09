import java.util.Scanner;
class HCF_GCD
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
		int num2=sc.nextInt();
		int sm=num1<num2?num1:num2;
		while(true)
		{
			if(num1%sm==0 && num2%sm==0)
			{
				System.out.println(sm);
				break;
			}
			sm--;
		}
	}
}
