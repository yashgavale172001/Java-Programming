package Inheritance;

public class Vehical 
{
   int tyres;
   String color;
   double speed;
   
   Vehical()
   {
	   
   }
  // public void display(int tyres,String color,double speed)
   Vehical(int tyres,String color,double speed)
   {
	   this.tyres=tyres;
	   this.color=color;
	   this.speed=speed;
	   System.out.println("Vehicle constructor");
   }
}
