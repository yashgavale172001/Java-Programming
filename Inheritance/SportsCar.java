package Inheritance;

public class SportsCar extends Car
{
    double top_speed;
    String ownername;
    double fuelcapacity;
    
    /*SportsCar()
    {
    	
    }*/
    
    SportsCar(double top_speed,String ownername,double fuelcapacity,int gears,String name,String brand,String engine,int seater,int tyres,String color,double speed)
    {
    	super(gears,name,brand,engine,seater,tyres,color,speed);
    	this.top_speed=top_speed;
    	this.ownername=ownername;
    	this.fuelcapacity=fuelcapacity;
    	System.out.println("Sportscar constructor");
    }
    
    public void display()
    {
    
    	System.out.println("top_speed of car is "+top_speed);
    	System.out.println("Owner of the car is "+ownername);
    	System.out.println("capacity of fuel tank is "+fuelcapacity);
    	System.out.println("Number of gears are "+gears);
    	System.out.println("Name of car is "+name);
    	System.out.println("Brand of car is "+brand);
    	System.out.println("engine of car is (Petrol/deisel) "+typeengine);
    	System.out.println("Car is "+seater+" Seater");
    	System.out.println("number of tyres "+tyres);
    	System.out.println("color of car is "+color);
    	System.out.println("Speed of Sportscar is"+speed);
    }
    
}
/*int gears;
// double top_speed;
 String name;
 String brand;
 String engine;
 String capacity;*/