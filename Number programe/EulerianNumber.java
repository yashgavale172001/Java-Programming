import java.util.Scanner;
class  EulerianNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any four digit number");
		int num=sc.nextInt();
		printCount(num);
	}
	public static void printCount(int num)
	{
		int c=1,a=0,b=0,count=0;
		while(num>0)
		{
			if(c<=2)
			{
				int rem=num%10;
                if(rem<a)
				{
					count++;
				}
				a=rem;
				c++;
				num/=10;
			}
			else{
				int rem=num%10;
                if(rem<b)
				{
					count++;
				}
				b=rem;
				c++;
				num/=10;
			}
		}
		if(count==2)
		{
			System.out.println("its Eulerian Number");
		}
		else{
			System.out.println("its not Eulerian Number");
		}
	}
}
