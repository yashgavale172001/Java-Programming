package String;
import java.util.Arrays;
import java.util.Scanner;
public class replaceWord 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s="My name is yash gavale";
	  String a[]=s.split(" ");
	  System.out.println("Enter which word is to be replaced");
	  String s1=sc.next();
	  System.out.println("Enter the word which is to be replaced");
	  String s2=sc.next();
	  String ans=Replace(a,s1,s2);
	  System.out.println(ans);
  }
  public static String Replace(String a[],String old,String New)
  {
	  String ans="";
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i].equals(old))
		  {
			  a[i]=New;
		  }
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  ans+=a[i]+" ";
	  }
	  return ans;
  }
}
