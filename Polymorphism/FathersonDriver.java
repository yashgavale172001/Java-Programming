package Polymorphism;

public class FathersonDriver 
{
   public static void main(String args[])
   {
	   Father f=new Son();   //upcasting
	   f.display();
	   //f.finance();
	  // f.a(); //method a()is undefined for type Father
	   
	   Son s=(Son)f; //downcasting 
	  // s.a();
	   s.a(); // after downcasting son is showing his properties
	   s.display();
	   
	   
   }
}
