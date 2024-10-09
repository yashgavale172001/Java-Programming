package numprogramme;
//find perticular number is fibo or not
import java.util.Scanner;
public class RangeFibo 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  int n1=0,n2=1,n3;
	  
	  for(; ;)
	  {
		  if(n1==num)
		  {
			  System.out.println(num+" is in the series ");
			  break;
		  }
		  else if(n1>num){
			  System.out.println(num+" is not in series ");
			  break;
		  }
		  else {
			  n3=n1+n2;
			  n1=n2;
			  n2=n3;
		  }
	  }
  }
}
