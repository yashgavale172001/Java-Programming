package Abstraction;

public  class Bdowncasting extends Adowncasting
{
  String camera="48 pixel";
  String display="full HD";
  
  @Override
  public void displaycamera()
  {
	  System.out.println("camera is :"+camera);
  }
  @Override
  public  void displaydisplay()
  {
	  System.out.println("camera display is "+display);
  }
  public void message()
  {
	  System.out.println("hello...jayuhh here..");
  }
}
