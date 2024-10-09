package Arrays;

public class FreqNumber 
{
  public static void main(String args[])
  {
	  int a[]= {1,2,2,1,3};
	  for(int i=0;i<a.length;i++)
	  {
		  int sum=0;
		  int x=a[i];
		  for(int j=i;j<a.length;j++)
		  {
			  if(x==a[j] && a[j]!=-1)
			  {
				  sum++;
				  a[j]=-1;
			  }
			  
		  }
		  if(x!=-1)
		  {
			  System.out.println(x+" repeated "+sum+" times");
		  }
	  }
  }
}
