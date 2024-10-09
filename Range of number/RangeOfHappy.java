import java.util.Scanner; 
class  RangeOfHappy            // this will not print happy numbers because 1 is happy number after that 4 is unhappy number between them we will not get any number so while loop wil go in infinity loop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
        check(a,b);
	}
	public static void check(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int x=i;
			while(true)
			{
				int s=sqSum(x);
				x=s;
                if(s==1)
				{
					System.out.println(i+ " is Happy Number");
					break;
				}
				//System.out.println(1);
				
			}
		}
	}
	public static int sqSum(int num)
	{
		int s=0;
		while(num>0)
		{
			int last=num%10;
			int sq=last*last;
			s+=sq;
			num/=10;
		}
		return s;
	}

}
