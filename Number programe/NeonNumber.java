import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        int sq=num*num;
        int s=0;
		while(sq>0)
		{
			s+=(sq%10);
			sq/=10;
		}
		if(s==num)
		{
			System.out.println("Its neon number");
		}
		else{
			System.out.println("its not neon number");
		}
	}
}
