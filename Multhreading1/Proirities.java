package Multhreading1;

public class Proirities 
{
   public static void main(String args[])
   {
	   System.out.println(Thread.currentThread().getPriority());
	   //Thread.currentThread().setPriority(17);
	   Thread.currentThread().setPriority(7);
	   MyThreadP mp=new MyThreadP();
	   System.out.println(mp.getPriority());
   }
}
