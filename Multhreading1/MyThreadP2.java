package Multhreading1;

public class MyThreadP2 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		  {
			  System.out.println("child thread");
		  }
	}
	 
}
