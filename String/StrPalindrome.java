package String;

public class StrPalindrome 
{
  public static void main(String args[])
  {
	  String s="acbaa";
	  if(isPalindrome(s))
	  {
		  System.out.println("String is palindrome");
	  }
	  else {
		  System.out.println("String is not palindrome");
	  }
  }
  public static boolean isPalindrome(String s)
  {
	  int i=0;
	  for(;i<=s.length()/2;i++)
	  {
		  if(s.charAt(i)!=s.charAt(s.length()-i-1))
		  {
			  break;
		  }
		 
	  }
	  if(i==(s.length()/2)+1)
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
	  
  }
}
