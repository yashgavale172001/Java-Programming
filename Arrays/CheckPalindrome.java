package Arrays;

public class CheckPalindrome 
{
  public static void main(String args[])
  {
	  int a[]= {6,2,4,4,2,6,7};
	  //int a[]= {1,2,3,4,5,6};
	  int i=0;
	  for(;i<a.length;i++)
	  {
		  if(a[i]!=a[a.length-i-1] && i<(a.length/2))
		  {
			  break;
		  }
	  }
	  if(i==a.length)
	  {
		  System.out.println("Its Palindrome");
	  }
	  else {
		  System.out.println("Its not Palindrome");
	  }
  }
}
