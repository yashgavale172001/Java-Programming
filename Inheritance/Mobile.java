package Inheritance;

public class Mobile 
{
   double size;
   String brand;
   String name;
   double price;
   String display;
   double weight;
   
   Battery b=new Battery(6000,115.5,"Xaomi");
   Mobile(double size,String brand,String name,double price,String display,double weight)
   {
	   this.size=size;
	   this.brand=brand;
	   this.name=name;
	   this.price=price;
	   this.display=display;
	   this.weight=weight;
   }
   
   //b.display();
   public void display()
   {
	   b.display();
	   System.out.println("mobile components");
	   System.out.println(".................");
	   System.out.println("Size of mobile is: "+size);
	   System.out.println("mobile brand is: "+brand);
	   System.out.println("Name of mobile is: "+name);
	   System.out.println("Price of mobile is: "+price);
	   System.out.println("Display size is: "+display);
	   System.out.println("Mobile weight is: "+weight);
   }
  
}
