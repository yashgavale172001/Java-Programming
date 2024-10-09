package String;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseWordSamePosition 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  //String s="I love my country";
	  String s1[]=Stringarray(s);
	  //System.out.println(Arrays.toString(s1));
	  String s2[]=reverse(s1);
	  String s3=convert(s2);
	  System.out.println(s3);
	  
  }
  public static String[] reverse(String s[])
  {
	  String ans[]=new String[s.length];
	  for(int i=0;i<s.length;i++)
	  {
		  String rev="";
		  for(int j=s[i].length()-1;j>=0;j--)
		  {
			  rev+=s[i].charAt(j);
		  }
		  ans[i]=rev+" ";
		  //System.out.println(rev+" ");
	  }
	  //String a=convert(ans);
	  return ans;
}
  public static String convert(String c[])
  {
	  String ans="";
	  for(int i=0;i<c.length;i++)
	  {
		  ans+=c[i];
	  }
	  return ans;
  }
  public static String[] Stringarray(String s)
  {
	  int count=CountWords(s);
	  String s1[]=new String[count];
	  DivideByWords(s1,s);
	  return s1;
  }
  public static void DivideByWords(String s[],String s1)
  {
	  int j=0;
	  for(int i=0;i<s.length;i++)
	  {
		  String ans="";
		  for(;j<s1.length();j++)
		  {
			  if(s1.charAt(j)==' ')
			  {
				  j++;
				  break;
			  }
			  else {
				  ans+=s1.charAt(j);
			  }
		  }
		 
		  s[i]=ans;
	  }
  }
  public static int CountWords(String s)
  {
	  int count=0;
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)==' ')
		  {
			  count++;
		  }
	  }
	 	  return ++count;
  }
}
