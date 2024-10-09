package Multhreading;

public class SuperThread extends Thread
{
  public void start()
  {
	  super.start();
	  System.out.println("Start method");
  }
  public void run()
  {
	  System.out.println("Run method");
  }
}
