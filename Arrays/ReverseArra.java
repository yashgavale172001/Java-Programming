package Arrays;

public class ReverseArra 
{
  public static void main(String args[])
  {
	  int arr[]= {1,4,23,5,6,7,8,16};
	  for(int i=0;i<arr.length/2;i++)
	  {
		  int temp=arr[i];
		  arr[i]=arr[arr.length-i-1];
		  arr[arr.length-i-1]=temp;
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
  }
  
}
