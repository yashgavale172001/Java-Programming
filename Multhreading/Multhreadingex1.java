package Multhreading;

public class Multhreadingex1 
{
  public static void main(String args[])
  {
	  MyThread o=new MyThread();
	  o.start();
	  Thread.currentThread().setName("Yash");
	  for(int i=0;i<=10;i++)
	  {
		  System.out.println(Thread.currentThread().getName()+":"+i);
	  }
  }
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		//System.out.println(Thread.currentThread().getName()); //Thread-0
		Thread.currentThread().setName("suresh");
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
