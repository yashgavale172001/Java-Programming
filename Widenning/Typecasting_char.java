class Typecasting_char 
{
	public static void main(String[] args) 
	{
		char c='c';

		//short s=c; incompatible types: possible lossy conversion from char to short
		int a=c;
		long l=c;
		float f=c;
		double d=c;
		//byte b=c; incompatible types: possible lossy conversion from char to byte

		//System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		//System.out.println(b);
		
	}
}
