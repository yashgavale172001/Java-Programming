package Abstraction;

public class CalculatoriImp extends Calculator
{
	
//	CalculatoriImp()
//	{
//		
//	}
	@Override
   public void add(int a,int b)
   {
	   System.out.println(a+b);
   }
	
	@Override
	public void divide(double a, double b)
	{
		System.out.println(a/b);
	}
	
	@Override
	public void multiply(double a,double b)
	{
		System.out.println(a*b);
	}
	
	public void message()
	{
		System.out.println("Its bad company");
	}
}
