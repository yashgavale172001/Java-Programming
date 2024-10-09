import java.util.Scanner;
class  p9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
        int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
            for(int j=0;j<(2*i)-1;j++)
			{   System.out.print(a);
				if(j<((2*i)-1)/2)
				{
					a++;
				}
				else{
					a--;
				}
			}
			a=1;
			System.out.println();
		}
	}
}
