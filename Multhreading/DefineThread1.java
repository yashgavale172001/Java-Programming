package Multhreading;

public class DefineThread1 extends Thread
{
  @Override
  public void run()
  {
	  for(int i=0;i<5;i++)
	  {
		  System.out.println("child thread");
	  }
  }
}
