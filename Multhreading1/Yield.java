package Multhreading1;

class Yield extends Thread
{
   public void run()
   {
	   for(int i=0;i<3;i++)
	   {
		   System.out.println("Child thread");
		   Thread.yield();
	   }
   }
}

