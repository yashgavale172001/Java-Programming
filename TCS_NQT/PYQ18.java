package TCS_NQT;

public class PYQ18 
{
  public static void main(String args[])
  {
	  int arr[]= {1,2,3,-3,1,1,1};
	  int k=3;
	  int ct=0;
	  for(int i=0;i<arr.length;i++)
	  {
		  int s=0;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  s+=arr[j];
			  if(s==k)
			  {
				  ct++;
			  }
		  }
	  }
	  System.out.println(ct);
  }
}
