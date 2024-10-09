class Typecasting_Byte
{
	public static void main(String[] args) 
	{
		byte b=20;

		short s=b;
		//char c=b; Incompatible type loosy conversion from byte to char
		int a=b;
		long l=b;
		float f=b;
		double d=b;

		System.out.println(s);
		//System.out.println(c);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}
