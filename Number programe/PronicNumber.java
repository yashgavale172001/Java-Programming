import java.util.Scanner; 
class  PronicNumber
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
       int i=0;
	   for(;i<num/2;i++)
		{
			if(i*(++i)==num)
			{
				System.out.println("its pronic number");
			}
		}
		if(i==num/2)
		{
			System.out.println("its not pronic number");
		}
	}
}
