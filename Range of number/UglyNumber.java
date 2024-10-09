import java.util.Scanner;
/*class UglyNumber 
{
	
	public static int divideBy(int num,int gcd)
	{
		while(num%gcd==0)
		{
			num/=gcd;
		}
		return num;
	}
	public static boolean check(int num)
	{
		 num=divideBy(num,2);
		 num=divideBy(num,3);
		 System.out.println(divideBy(num,5));

		return (num==1)?true:false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        boolean b=check(a);
		if(b)
		{
			System.out.println("Its Ugly number");
		}
		else{
			System.out.println("Its not ugly number");
		}
	}

}*/
class UglyNumber
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();

}
