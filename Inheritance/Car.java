package Inheritance;

public class Car extends Vehical
{
   int gears;
  // double top_speed;
   String name;
   String brand;
   String typeengine;
   int seater;
   
   /*public void display()
   {
	   System.out.println();
   }*/
   /*Car()
   {
	   
   }*/
   Car(int gears,String carname,String brand,String typeengine,int seater,int tyres,String color,double speed)
   {
	   super(tyres,color,speed);
	   this.gears=gears;
	   this.name=carname;
	   this.brand=brand;
	   this.typeengine=typeengine;
	   this.seater=seater;
	   System.out.println("Car constructor");
   }
}
//super(gears,name,brand,engine,seater,tyres,color,speed);