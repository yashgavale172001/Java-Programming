import java.util.Scanner;
class  calculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		//System.out.println("Enter your 1st number");
		//int num1=sc.nextInt();
		//System.out.println("Enter your 2nd number");
		//int num2=sc.nextInt();
		System.out.println("*****CALCULATOR******");
		System.out.println("1. + ");
		System.out.println("2. - ");
		System.out.println("3. * ");
		System.out.println("4. / ");
        System.out.println("which operation you want to perform");
        int ip=sc.nextInt();

		switch(ip){
			case 1:
				{
				System.out.println("Enter 1st number");
				double d1=sc.nextDouble();
				System.out.println("Enter 2nd number");
				double d2=sc.nextDouble();
                double d3=d1+d2;
                System.out.println("Addition of "+d1+" and "+d2+" is "+d3);
				break;
				}

				case 2:
				{
				System.out.println("Enter 1st number");
				double s1=sc.nextDouble();
				System.out.println("Enter 2nd number");
				double s2=sc.nextDouble();
                double s3=s1-s2;
                System.out.println("Substraction of "+s1+" and "+s2+" is "+s3);
				break;
				}
				case 3:
				{
				System.out.println("Enter 1st number");
				double m1=sc.nextDouble();
				System.out.println("Enter 2nd number");
				double m2=sc.nextDouble();
                double m3=m1*m2;
                System.out.println("Multiplication of "+m1+" and "+m2+" is "+m3);
				break;
				}
				case 4:
				{
				System.out.println("Enter 1st number");
				double a1=sc.nextDouble();
				System.out.println("Enter 2nd number");
				double a2=sc.nextDouble();
                double a3=a1/a2;
                System.out.println("Substraction of "+a1+" and "+a2+" is "+a3);
				break;
                }
				default:
					{
						System.out.println("you entered wrong operation ");
					}
				
		}
			
	}
}
