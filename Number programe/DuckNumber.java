import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			if(num%10==0)
			{
				count++;
			}
			num/=10;
		}
		if(count>=1)
		{
			System.out.println("it is duck number which contains "+count+" Zeros");
		}
		else{
			System.out.println("its not duck number ");
		}
	}
}
