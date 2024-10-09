import java.util.Scanner;
class  Nums2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int a=i;
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(a);
				if(j<=((2*i)-1)/2)
				{
					a--;
				}
				else{
					a++;
				}
			}
			System.out.println();
		}
	}
}
