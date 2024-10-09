package Interface;

public class CalculatorImp implements Calculator
{
     @Override
     public void add(int a,int b)
     {
    	 System.out.println(a+b);
     }
     @Override
     public int multiply(double a,double b)
     {
    	 return (int)(a*b);
     }
     @Override
     public void divide(double a,double b)
     {
    	 System.out.println(a/b);
     }
     public void message()
     {
    	 System.out.println("message method from implementing class");
     }
}
