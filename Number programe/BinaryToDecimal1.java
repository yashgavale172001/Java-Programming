import java.util.Scanner;

class BinaryToDecimal1
{
	public static int bToD(int last,int raise)
    {
	  int s=1;
	  for(int i=0;i<raise;i++)
	  {
	    	s*=2;
	  }
	   return last*s;
    }
	public static void conv(int b,int a)
	{
		int s=0;

		for(int i=0;i<a;i++,b/=10)
		{
			int rem=b%10;
			s+=bToD(rem,i);
		}
		System.out.println(s);
	}
	public static int count(int b)
	{
		int s=0;
		while(b>0)
		{
			s++;
			b/=10;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int  b=sc.nextInt();
		int a=count(b);
		conv(b,a);
	}

	
}
