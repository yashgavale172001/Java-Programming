import java.util.Scanner;
class  PyramidNums
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int n=sc.nextInt();
		int space=n/2;
        for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(j+" ");
			}
			if(i<n/2)
			{
				space--;
			}
			else{
				space++;
			}
		}
		System.out.println(n);
	}
}
