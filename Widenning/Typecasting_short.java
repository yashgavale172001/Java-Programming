class Typecasting_short 
{
	public static void main(String[] args) 
	{
		short s=100;

		//char c=s; incompatible types: possible lossy conversion from short to char
		int a=s;
		long l=s;
		float f=s;
		double d=s;
		//byte b=s; incompatible types: possible lossy conversion from short to byte

		//System.out.println(c);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		//System.out.println(b);
	}
}
