import java.util.Scanner;
class Pyramid
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int n=sc.nextInt();
		int space =n/2;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			if(i<(n/2+1))
			{
				space--;
				star+=2;
			}
			else{
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}
