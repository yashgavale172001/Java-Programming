import java.util.Scanner;
class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        System.out.println(conversion(n));
	}
	public static String conversion(int a)
	{
		String bin=" ";
		while(a>0)
		{
			int rem=a%2;
			bin=rem+bin;
			a/=2;
		}
		return bin;

	}
}






























                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    