package Inheritance;

public class Battery 
{
     int mah;
     double weight;
     String brand;
     
     
     Battery(int mah,double weight,String brand)
     {
    	 this.mah=mah;
    	 this.weight=weight;
    	 this.brand=brand;
     }
     
     public void display()
     {
    	 System.out.println("battery components");
  	     System.out.println(".................");
    	 System.out.println(mah+"mah Battery");
    	 System.out.println("Weight of battery is: "+weight);
    	 System.out.println("Brand name: "+brand);
     }
}
