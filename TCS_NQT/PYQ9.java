package TCS_NQT;
//we are given a list of numbers we need to return max difference between smallest and lasgest number
//note= smallest number should be before largest number
import java.lang.Math;
public class PYQ9 
{
  public static void main(String args[])
  {
	  int arr[]= {-3,-5,1,6,-7,11,8};
	  int largest=Integer.MIN_VALUE;
	  int maxdiff=Integer.MIN_VALUE;
	  
	  for(int i=arr.length-1;i>=0;i--)
	  {
		 int num=arr[i];
		  largest=Math.max(largest, num);
		  maxdiff=Math.max(maxdiff, largest-num);
	  }
	  System.out.println(maxdiff);
	  
  }
}
