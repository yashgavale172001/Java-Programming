package String;
import java.util.Arrays;
public class removeDuplicateWords 
{
  public static void main(String args[])
  {
	  String s="My name is yash gavale gavale";
	  int count=CountWords(s);
	  String s1[]=new String[count];
	  //System.out.println(s1.length);
	  StringDivide(s,s1);
	  Arrays.sort(s1);
	  //System.out.println(Arrays.toString(s1));
	 String s3= removeDuplicates(s1);
	 System.out.println(s3);
	  
  }
  public static String removeDuplicates(String s[])
  {
	  String ans="";
	  int count=1;
	  int i=1;
	 // System.out.println();
	  for(;i<s.length;i++)
	  {
		  if(s[i].equals(s[i-1]))
		  {
			  
		  }
		  else {
			  //System.out.print(s[i-1]+" ");
			  ans+=s[i-1]+" ";
		  }
		  
	  }
	  ans+=s[i-1]+" ";
	  //System.out.println(ans);
	  return ans;
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
  public static void StringDivide(String s,String a[])
  {
	  
	  int j=0;
	  for(int i=0;i<a.length;i++)
	  {
		  String ans="";
		  for(;j<s.length();j++)
		  {
			  if(s.charAt(j)==' ')
			  {
				  j++;
				  break;
			  }
			  else {
				  ans+=s.charAt(j);
			  }
		  }
		  a[i]=ans;
	  }
	  //a[i-1]=ans;
  }
}
