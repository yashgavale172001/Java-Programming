package Multhreading1;

public class MainChildExecution 
{
  public static void main(String args[])
  {
	  MyThreadP2 p2=new MyThreadP2();
	  p2.setPriority(10);
	  p2.start();
	  for(int i=0;i<3;i++)
	  {
		  System.out.println("main thread");
	  }
  }
}
