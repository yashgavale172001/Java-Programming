package String;
import java.util.Scanner;
public class rplaceCharToNewChar 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s="Yash Gavale";
	  char ch=sc.next().charAt(0);
	  String s1=replace(s,ch,'@');
	  System.out.println(s1);
  }
  public static String replace(String s,char ch,char c)
  {
	  String ans="";
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)==ch)
		  {
			  ans+=c;
		  }
		  else {
			  ans+=s.charAt(i);
		  }
	  }
	  return ans;
  }
}
