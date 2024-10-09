class narrowDouble 
{
	public static void main(String[] args) 
	{
		double d=243.99987;

		float f=(float)d;
		long l=(long)d;
		int i=(int)d;
		char c=(char)d;
		short s=(short)d;
		byte b=(byte)d;

		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);
	}
}
