package TCS_NQT;
//find the sub arrays which having sum =7
import java.util.Scanner;
public class PYQ1 
{
  public static void main(String args[])
  {
	  Scanner sc= new Scanner(System.in);
	  int n=sc.nextInt();
	  int ar[]= {3,4,-7,1,3,3,1,-4};
	 
	  for(int i=0;i<ar.length;i++)
	  {
		  int ar2[]=new int [ar.length];
		  int sum=0;
		  sum+=ar[i];
		  ar2[i]=ar[i];
		  for(int j=i+1;j<ar.length;j++)
		  {
			  ar2[j]=ar[j];
			  sum=sum+ar[j];
			  if(sum==n)
			  {
				  for(int k=0;k<ar2.length;k++)
				  {
					  if(ar2[k]!=0)
					  System.out.print(ar2[k]+" ");
				  }
				  System.out.println();
				  //break;
			  }
		  }
	  }
  }
}
