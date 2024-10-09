import java.util.Scanner;
class  BouncyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		checkBouncy(num);
	}
	public static void checkBouncy(int num)
	{
		int ct=count(num);
		int last=num%10;
		num/=10;
        if(num%10>last)
		{
			while(num>0)
			{
				last=num%10;
				num/=10;
				if(num%10>=last)
				{
					
				}
				else{
					
				}
			}
		}
		if(num%10<last)
		{
			
		}
	}
	public static int count(int num)
	{
		int s=0;
		while(num!=0)
		{
			s++;
			num/=10;
		}
		return s;
	}
}
