import java.util.Scanner;
/*class FacinatingNumber
{
	public static void main(String [] args)
    {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int n1=num*2;
	   int n2=num*3;
	   String s=concate(n1,n2,num);
	   check(s);
	 
    }
	public static String concate(int a,int b,int c)
	{
		String s1=String.valueOf(a);
		String s2=String.valueOf(b); 
		String s2=String.valueOf(c); 
		return s1+s2;
	}
	public static void check(String s)
	{
		int count=0;
		for(int i=0;i!=s.length();i++)
		{
			for(int j=0;j!=s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}

		}
		if(count==s.length())
		{
			System.out.println("its Facinating number");
		}
		else{
			System.out.println("its not facinating number");
		}
	}
}*/

class FacinatingNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n1=num*2;
		int n2=num*3;
		int con=concat(n1,num);
		int con2=concat(n2,con);
		//System.out.println(con2);
		checkFacinatingNumber(con2);
	}
	public static int concat(int n1,int num)
	{
		int count1=count(n1);
		int s=1;
		for(int i=1;i<=count1;i++)
		{
			s*=10;
		}
		return num*s+n1;
	}
	public static int count(int n1)
	{
		int ct=0;
		while(n1>0)
		{
			n1/=10;
			ct++;
		}
		return ct;
	}
	public static void checkFacinatingNumber(int num)
	{
		//int cnt=count(num);
		int n=num; 
		int n2=num;
		while(num>0)
		{
			int rem=num%10;
			int flag=0;
			while(n>0)
			{
				int rem1=n%10;
				if(rem==rem1)
				{
					flag++;
				}
				n/=10;
			}
			
			if(flag>1)
			{
				System.out.println("Its not facinating number");
				break;
			}
			n=n2;
			num/=10;
		}
		if(num==0)
		{
			System.out.println("Its facinating number");
		}
	}
}
