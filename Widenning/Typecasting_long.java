class Typecasting_long 
{
	public static void main(String[] args) 
	{
		long l= 200000022;

		//short s=l; //incompatible types: possible lossy conversion from int to short
		//int a=l;  // incompatible types: possible lossy conversion from int to short
		float f=l;
		double d=l;
		//byte b=l; //incompatible types: possible lossy conversion from int to short
		//char c=l; //incompatible types: possible lossy conversion from int to short

		//System.out.println(s);
		//System.out.println(c);
		//System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		//System.out.println(b);
	}
}
