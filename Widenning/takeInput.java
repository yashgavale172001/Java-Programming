import java.util.Scanner;
class takeInput 
{
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the age: ");
		 int a=sc.nextInt();

		 System.out.print("Enter your name: ");
		 String s=sc.next();

		 System.out.print("Enter your Ex's First letter: ");
         char ch=sc.next().charAt(0);

		 System.out.print("Enter the float value: ");
		 float f=sc.nextFloat();

		 System.out.print("Enter the double value: ");
		 double d=sc.nextDouble();

		 System.out.print("Enter boolean value: ");
		 boolean bool=sc.nextBoolean();

		 System.out.print("Enter the long value: ");
		 long l=sc.nextLong();

		 System.out.print("Enter the byte value: ");
		 byte b=sc.nextByte();

		 System.out.print("Enter the Short value: ");
		 short sh=sc.nextShort();

		 //System.out.println(a);
	}
}
