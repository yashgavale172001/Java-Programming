import java.util.Scanner;
class  chars
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int num=sc.nextInt();
		char ch='a';
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
