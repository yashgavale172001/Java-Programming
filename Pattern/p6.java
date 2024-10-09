/*
Enter the number
4
1
2 5
3 6 8
4 7 9 10
*/
import java.util.Scanner;
class p6 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int a=3;
			int b=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b+" ");
				b=b+a;
				a--;
			}
			System.out.println();
		}
	}
}
