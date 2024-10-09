class Basics
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//System.out.println(true>false); error bad operand types for binary operator '>'
		System.out.println(true!=false); //ture
		System.out.println(true==false); //false
		System.out.println(1.1/1.1f);  // 1.0000000216744163
		System.out.println(1.1f > 1.1); // true
		System.out.println('q'<=113); // true
		//System.out.println(true==1); error incomparable types boolean and int
		//System.out.println("yash">"gavale"); error bad operand types for binary operator '>'
		System.out.println("yash"=="gavale"); // false
		System.out.println("Yash"=="yash");   // false
		System.out.println("Yash "+"Gavale"); // Yash Gavale
		System.out.println("Hi"=="Hi"); // true
		System.out.println("Hi"=="hi");  // false
		System.out.println(0.0>0); // false
		System.out.println((22.0/7.0)>(22.0f/7.0f)); // true, because 22.0 , 7.0 is double  and 22.0f and 7.0f is float 
		System.out.println('b'/'a');

		float f=1.1f;
		double d=1.1;
		boolean b= f>d;
		System.out.println(b);
	} 
}
