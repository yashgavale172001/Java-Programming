package Arrays;

public class HalfReverse 
{
   public static void main(String args[])
   {
	   int ar[]= {1,2,3,4,5,6,7};
	   int j=1;
	   int k=1;
	   for(int i=ar.length/2;k<=(ar.length-(ar.length/2))/2;i++)
	   {
		   int temp=ar[i];
		   ar[i]=ar[ar.length-j];
		   ar[ar.length-j]=temp;
		   k++;
		   j++;
	   }
	   
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.print(ar[i]);
	   }
   }
}
