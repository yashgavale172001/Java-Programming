import java.util.Scanner;
class FacinatingNumber
{
	public static void main(String [] args)
    {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int n1=num*2;
	   int n2=num*3;
	   String s=concate(n1,n2);
	   check(s);
	 
    }
	public static String concate(int a,int b)
	{
		String s1=String.valueOf(a);
		String s2=String.valueOf(b); 
		return s1+s2;
	}
	public static void check(String s)
	{
		int count=0;
		for(int i=0;i!='/0';i++)
		{
			for(int j=0;j!='/0';j++)
			{
				if(s[i]==s[j])
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
}
