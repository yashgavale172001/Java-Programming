import java.util.Scanner;
/*class SpaceNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();  
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	
	}
}*/

class SpaceNum1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int n=sc.nextInt();
        for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

