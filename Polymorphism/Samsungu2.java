package Polymorphism;

public class Samsungu2 extends Samsungu1
{
//  Samsungu2(String mode,String display)
//  {
//	  this.mode=mode;
//	  this.display=display;
//  }
	String mode="Dark";
	String display="Super Amoled";
  
  public void displayMode()
  {
	  System.out.println("Mode of mobile is :"+mode);
  }
  public void display()
  {
	  System.out.println("Display of mobile is :"+display);
  }
  public void A()
  {
	  System.out.println("From A");
  }
}
