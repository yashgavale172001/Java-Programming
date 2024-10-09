package Multhreading;

public class ThreadDriver 
{
  public static void main(String args[])
  {
	  //default main thread is there
	  DefineThread1 t=new DefineThread1();//initialisation of thread
	  t.start();  //starting of thread
	  
	  for(int i=0;i<5;i++)
	  {
		  System.out.println("main thread");
	  }
	  
  }
}
