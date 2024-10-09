import java.util.Scanner;
class  p7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        int incOdd=1;
		int incEven=7;
		int ans;

		for(int i=1;i<=n;i++)
		{
			ans=i;
			System.out.print(ans+" ");
			for(int j=1;j<n;j++)
			{
				if(j%2==0)
				{
					ans+=incOdd;
					System.out.print(ans+" ");
				}
				else{
					ans+=incEven;
					System.out.print(ans+" ");
				}
			}
			System.out.println();
			incOdd+=2;
			incEven-=2;
		}
	}
}
