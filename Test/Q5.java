import java.util.Scanner;
class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("what kind of data you want to store");
        System.out.println("1.int");
		System.out.println("2.byte");
		System.out.println("3.short");
		System.out.println("4.long");
		System.out.println("5.double");
		System.out.println("6.float");
        System.out.println("7.char");
		int i= nextInt();
		switch(i){
			case 1:{
				System.out.println("Enter your data");
				int a=sc.nextInt();
				System.out.println("Your variables data is"+a);
			}
			case 2:{
				System.out.println("Enter your data");
				byte a=sc.nextIByte();
				System.out.println("Your variables data is"+a);
			}
			case 3:{
				System.out.println("Enter your data");
				short a=sc.nextShort();
				System.out.println("Your variables data is"+a);
			}
			case 4:{
				System.out.println("Enter your data");
				long a=sc.nextLong();
				System.out.println("Your variables data is"+a);
			}
			case 5:{
				System.out.println("Enter your data");
				double a=sc.nextDouble();
				System.out.println("Your variables data is"+a);
			}
			case 6:{
				System.out.println("Enter your data");
				float a=sc.nextFloat();
				System.out.println("Your variables data is"+a);
			}
			case 7:{
				System.out.println("Enter your data");
				char a=sc.next().charAt();
				System.out.println("Your variables data is"+a);
			}
		}
	}
}
