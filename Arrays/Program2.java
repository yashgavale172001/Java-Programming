package Arrays;

public class Program2 
{
  public static void main(String args[]) 
  {
	  int ar[]= {10,4,3,6,8,1,2};
	  printnnums(ar);
  }
  public static void printnnums(int ar[])
  {
	  //int min=Integer.MIN_VALUE;
	  for(int i=0;i<ar.length;i++)
	  {
		  boolean flag=false;
		  for(int j=i+1;j<ar.length;j++)
		  {
			  if(ar[i]>=ar[j])
			  {
				  flag=true;
			  }
			  else
			  {
				  flag=false;
				  break;
			  }
		  }
		  if(flag==true)
		  {
			  System.out.print(ar[i]+" ");
		  }
	  }
	  System.out.println(ar[ar.length-1]);
  }
}
