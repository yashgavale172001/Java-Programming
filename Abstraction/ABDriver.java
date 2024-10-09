package Abstraction;

public class ABDriver 
{
   public static void main(String args[])
   {
	   Adowncasting a=new Bdowncasting();
	   a.displaycamera();
	  // a.message();
	   a.displaydisplay();
	   Adowncasting c=new Adowncasting();
	   Bdowncasting b=(Bdowncasting)c;
	   b.message(); 
	   
   }
}
