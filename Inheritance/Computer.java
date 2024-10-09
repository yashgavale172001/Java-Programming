package Inheritance;

public class Computer 
{
   String brand;
   String os;
   String processor;
   int size;
   String display;
   Pendrive p;
   Computer(String brand,String os,String Pro,int size,String display)
   {
	   this.brand=brand;
	   this.os=os;
	   processor=Pro;
	   this.size=size;
	   this.display=display;
   }
   
   public void insertPendrive(int size,String brand,String color)
   {
	   p=new Pendrive(size,brand,color);
	   //p.display();
	   System.out.println("Pendrive inserted");
   }
   public void display()
   {
	   System.out.println("Brand is: "+brand);
	   System.out.println("OS is: "+os);
	   System.out.println("Processor is: "+processor);
	   System.out.println("Storage is: "+size);
	   System.out.println("Display in Htz: "+display);
   }
}
