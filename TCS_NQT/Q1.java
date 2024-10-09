package TCS_NQT;
import java.util.Scanner;
public class Q1 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the vehicles");
	  int v=sc.nextInt();
	  System.out.println("Enter the wheels");
	  int w=sc.nextInt();
	  int two=v;
	  int four=0;
	  int i=0;
	  for(;i<v;i++)
	  {
		  if((four*4)+(two*2)==w)
		  {
			  System.out.println("there are "+four+" Four wheeler cars and "+two+" two Wheeler bikes");
			  break;
		  }
		  else {
			  four++;
			  two--;
		  }
	  }
	  if(i==200)
	  {
		 System.out.println("wrong combination"); 
	  }
	  
  }
}
