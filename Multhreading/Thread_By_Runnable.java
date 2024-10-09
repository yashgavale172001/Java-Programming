package Multhreading;

class impclass implements Runnable
{
   @Override
   public void run()
   {
	   System.out.println("Runnable run method");
	   DriverManager dm=new DriverManager();
	   dm.reet();
   }
   
}
class DriverManager extends Thread_By_Runnable
{
	public void reet()
	{
		System.out.println("Greeting from qspiders");
	}
}
public class Thread_By_Runnable{
	public static void main(String args[])
	{
		impclass dm=new impclass();
		Thread t=new Thread(dm);
		t.start();
	}
}

