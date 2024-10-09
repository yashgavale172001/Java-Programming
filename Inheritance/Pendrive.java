package Inheritance;

public class Pendrive {

   double size;
   String brand;
   String color;
   
   Pendrive(double size,String brand,String color)
   {
	    this.size=size;
	    this.brand=brand;
	    this.color=color;
   }
   
   public void display()
   {
	   System.out.println("Size of pendrive is: "+size);
	   System.out.println("Brand is: "+brand);
	   System.out.println("color is: "+color);
   }
}
