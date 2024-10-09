class Typecasting_float 
{
	public static void main(String[] args) 
	{
		float f= 200.33f;

		//short s=f; //incompatible types: possible lossy conversion from float to short
		//int a=f;  // incompatible types: possible lossy conversion from float to int
		//long l=f;
		double d=f;
		//byte b=f; //incompatible types: possible lossy conversion from float to byte
		//char c=f; //incompatible types: possible lossy conversion from float to char

		//System.out.println(s);
		//System.out.println(c);
		//System.out.println(a);
		//System.out.println(l);
		System.out.println(d);
		//System.out.println(b);
	}
}
