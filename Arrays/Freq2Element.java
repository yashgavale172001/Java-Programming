package Arrays;

public class Freq2Element 
{
  public static void main(String args[])
  {
	  int ar[]= {11,2,5,4,4,11,5,8};
	  for(int i=0;i<ar.length;i++)
	  {
		  int x=ar[i];
		  int s=0;
		  for(int j=i;j<ar.length;j++) 
		  {
			 if(x==ar[j] && ar[j]!=-1)
			 {
				 ar[j]=-1;
				 s++;
			 }
		  }
		  if(x!=-1)
		  {
			  System.out.println("Frequency of "+x+" is "+s);
		  }
	  }
  }
}
