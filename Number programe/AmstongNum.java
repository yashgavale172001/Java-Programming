import java.util.Scanner;
class AmstongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int n1=n;
		int count=0;
		int sum=0;
		while(n1>0)
		{
			n1/=10;
			count++;
		}
		System.out.println(count);
		for(int i=n;i!=0;i/=10)
		{
			int l=i%10;
			//System.out.println("last is "+l);
			int prod=1;
			for(int j=1;j<=count;j++)
			{
				prod=prod*l;
				//System.out.println("prod is "+prod);
			}
			sum+=prod;
			//System.out.println("sum is "+sum);
		}
		if(sum==n)
		{
			System.out.println(n+" is amstrong number");
		}
		else{
			System.out.println(n+" is not amstrong number");
		}
	}
}
