package Multhreading;

class MyThread3 extends Thread 
{
  
}
public class getThreadName
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		MyThread3 t=new MyThread3();
		System.out.println(t.getName());
		Thread.currentThread().setName("main thread new name yash");
		System.out.println(Thread.currentThread().getName());
		t.setName("child thread new name bacchu");
		System.out.println(t.getName());
	}
}
