import java.util.Scanner;
class p8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns");
		int n=sc.nextInt();
		int odd=0;
		int even=(n*2)-3;
		int ans;

		for(int i=1;i<=n;i++)
		{
			ans=i;
			System.out.print(ans+" ");
			for(int j=1;j<i;j++)
			{
				if(j%2==0)
				{
					ans+=odd;
					System.out.print(ans+" ");
					
				}
				else
				{
					ans+=even;
					System.out.print(ans+" ");
					
				}
			}
			if(i>1)
				{
				odd+=2;
				even-=2;
				}
			
			System.out.println();
		}
	}
}
