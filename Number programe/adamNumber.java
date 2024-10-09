import java.util.Scanner;
class adamNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int sq1=square(n);
        int rev=reverse(n);
        int sq2=square(rev);
		if(reverse(sq1)==sq2)
		{
			System.out.println("Its adam Number");
		}
		else{
			System.out.println("its not adam number");
		}
	}

	public static int square(int a)
	{
		return a*a;
	}
	public static int reverse(int rev)
	{
		int sum=0;
		while(rev>0)
		{
			sum=sum*10+rev%10;
			rev/=10;
		}
		return sum;
	}
}
