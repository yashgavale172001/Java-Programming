package Arrays;

public class HALFCLOCK 
{
  public static void main(String args[])
  {
	  int a[]= {1,2,3,4,5,6,7,8,9};
	 // int a[]= {1,2,3,4,5};
	  
	  int temp=a[a.length/2-1];
	  int i=a.length/2-1;
	  for(;i>0;i--)
	  {
		  a[i]=a[i-1];
	  }
	  a[i]=temp;
	  
	  int temp2=a[a.length/2];
	  int j=a.length/2;
	  for(;j<a.length-1;j++)
	  {
		  a[j]=a[j+1];
	  }
	  a[j]=temp2;
	  
	  for(int x=0;x<a.length;x++)
	  {
		  System.out.print(a[x]+" ");
	  }
  }
}
