import java.util.Scanner;
class DiagonalNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int n=sc.nextInt();
        for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || i+j==n+1)
				{
					if(i+j==n+1)
				   {
					System.out.print(i+"  ");
				   }
				   else{
					 System.out.print(j+"  ");
				   }
				}
				else{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
	}
}
