import java.util.Scanner;
class Pattern 
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the rows and columns");
		 int r=sc.nextInt();

		 for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
