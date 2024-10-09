package Multhreading1;

public class YieldDriver
{
	public static void main()
	{
		Yield y=new Yield();
		y.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("main thread");
		}
	}
}
