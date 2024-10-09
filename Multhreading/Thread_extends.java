package Multhreading;

class Driver extends Thread 
{
	@Override
  public void run()
  {
	  System.out.println("Thread run()");
	  deddy d=new deddy();
	  d.greet();
  }
	
}
class deddy extends Driver
{
	public void greet()
	{
		System.out.println("Goood Afternoooooonnn Sirrrrrrr! ");
	}
}
public class Thread_extends
{
	public static void main(String args[])
	{
		Driver d1=new Driver();
		d1.start();
	}
}