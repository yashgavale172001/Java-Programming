package Arrays;
import java.util.Arrays;
public class TwoPointerMerge 
{
  public static void main(String args[])
  {
	  int a1[]= {1,2,30,40,50,100,243};
	  int a2[]= {12,56,78,90,102};
	  int ans[]=new int[a1.length+a2.length];
	  int i=0,j=0,k=0;
	  while(k<ans.length)
	  {
		  if(a1[i]<a2[j])
		  {
			 // System.out.println(i);
			  ans[k]=a1[i];
			  i++;
			  k++;
			  //System.out.println(i);
		  }
		  else if(a1[i]>a2[j])
		  {
			  ans[k]=a2[j];
			  k++;
			  j++;
		  }
		  if(i==a1.length || j==a2.length)
		  {
			  //System.out.println(i+" i");
			  break;
		  }
	  }
	  if(i<a1.length)
	  {
		  while(i<a1.length)
		  {
			  ans[k]=a1[i];
			  i++;
			  k++;
		  }
	  }
	  else if(j<a2.length)
	  {
		  while(j<a2.length)
		  {
			  ans[k]=a2[j];
			  k++;
			  j++;
		  }
	  }
	  System.out.println(Arrays.toString(ans));
  }
}
