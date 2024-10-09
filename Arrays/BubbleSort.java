package Arrays;
import java.util.Arrays;
public class BubbleSort 
{
	public static void main(String args[])
	{
		int ar[]= {1,54,23,78,55,23,89};
		   
		   for(int i=0;i<ar.length-1;i++)
		   {
			   for(int j=0;j<ar.length-i-1;j++)
			   {
				   if(ar[j]>ar[j+1])
				   {
					   int temp=ar[j];
					   ar[j]=ar[j+1];
					   ar[j+1]=temp;
				   }
			   }
		   }
		   System.out.println(Arrays.toString(ar));
	}
   
}
