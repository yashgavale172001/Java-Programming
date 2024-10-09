package Arrays;

import java.util.Arrays;
public class SirFreqOfNum 
{
  public static void main(String args[])
  {
	  int ar[]= {4,4,3,3,3,2,2,2,2,1,1,1,1,1,8};
	  int ar2[]= new int[ar.length];
	  int count,j;
	  System.out.println(Arrays.toString(ar));
	  //System.out.println(Arrays.toString(ar2));
	  for(int i=0;i<ar.length;i++)
	  {
		  count=1;
		  for(j=i+1;j<ar.length;j++)
		  {
			  if(ar[i]==ar[j] && ar2[i]!=-1)
			  {
				  count++;
				  ar2[j]=-1;
				  ar2[i]=count;
			  }
			  else if(ar2[i]==-1){
				  break;
			  }
			  
		  }
		  if(ar2[i]!=-1 && count==1)
		  {
			  ar2[i]=count;
		  }
	  }
	 // System.out.println(Arrays.toString(ar2));
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar2[i]!=-1)
		  {
			  System.out.println(ar[i]+" repeated "+ar2[i]+" times");
		  }
	  }
	  
  }
}
