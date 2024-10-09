package numprogramme;

public class fibo 
{
  public static void main(String args[])
  {
	  int n=7;
	  int n1=0,n2=1,n3;
	  System.out.print(n1+" ");
	  System.out.print(n2+" ");
	  for(int i=2;i<n;i++)
	  {
		  n3=n1+n2;
		  System.out.print(n3+" ");
		  n1=n2;
		  n2=n3;
		  
	  }
  }
}
