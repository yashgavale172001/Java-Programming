class Typecasting_int 
{
	public static void main(String[] args) 
	{
		int a= 2;

		//short s=a; incompatible types: possible lossy conversion from int to short
		long l=a;
		float f=a;
		double d=a;
		//byte b=a; 
		//char c=a;

		//System.out.println(s);
		//System.out.println(c);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		//System.out.println(b);
	}
}
