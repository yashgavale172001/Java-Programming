package Multhreading;

public class SuperDriver 
{
  public static void main(String args[])
  {
	  SuperThread st=new SuperThread();
	  st.start();
	  System.out.println("Main method");
  }
}
