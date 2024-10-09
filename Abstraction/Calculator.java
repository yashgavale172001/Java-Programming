package Abstraction;

public abstract class Calculator 
{
   public abstract void add(int a,int b);
   
   public abstract void divide (double a,double b);
   public abstract void multiply(double a,double b);
   
   public static void greetings() // its not method shadowing bcoz it is not overrided in child class
   {
	   System.out.println("Welcome........!");
   }
}
