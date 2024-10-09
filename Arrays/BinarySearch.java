package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch 
{
  public static void main(String args[])
  {
	  int arr[]= {1,6,2,8,44,22,8,0};
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
	  binarySearch(arr);
  }
  public static void binarySearch(int arr[])
  {
	  Scanner sc=new Scanner(System.in);
	  int start=0,end=arr.length-1;
	  int mid=(start+end)/2;
	  int num=sc.nextInt();
	  while(start<=end)
	  {
		  if(num==arr[mid])
		  {
			  System.out.println(num+" found at index "+mid);
			  break;
		  }
		  else if(num>arr[mid])
		  {
			  start=mid+1;
		  }
		  else if(num<arr[mid])
		  {
			  end=mid-1;
		  }
		  mid=(start+end)/2;
	  }
	  
  }
}
