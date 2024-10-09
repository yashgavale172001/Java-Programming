package Arrays;

public class Palindrome 
{
   public static void main(String args[])
   {
	   int arr[]= {1,2,2,2,1};
	   int i=0;
	   for(;i<arr.length/2;i++)
	   {
		   if(arr[i]!=arr[arr.length-i-1])
		   {
			   break;
		   }
	   }
	   if(i==arr.length/2)
	   {
		   System.out.println("its palindrome");
	   }
	   else {
		   System.out.println("its not palindrome");
	   }
   }
}
