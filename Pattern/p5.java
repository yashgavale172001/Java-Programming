import java.util.Scanner;
class p5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=1;
		int b=a;
		for(int i=1;i<=n;i++)
		{
			for(int j=a;j<a+n;j++)
			{
				System.out.print(b+" ");
				b+=4;
			}
			a++;
			b=a;
			System.out.println();
		}
	}
}
