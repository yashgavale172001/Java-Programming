//this is hybrid approach for thread creation(combination of both of the approaches)
package Multhreading;

class Hybrid extends Thread
{
   public void run()
   {
	   System.out.println("child thread");
   }
}
public class HybridApproach
{
	public static void main(String args[])
	{
		Hybrid hb=new Hybrid();
		Thread t=new Thread(hb);
		t.start();
		System.out.println("main thread");
	}
}
