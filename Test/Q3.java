class Q3
{
	public static void main(String[] args) 
	{
		int a=1;
		int c=a;
		int b=10;
		int sum=0;
		while(a<=b)
		{
			sum+=a;
			a++;
		}
		System.out.println("Sum between "+c+" to "+b+" is "+sum);
	}
}
