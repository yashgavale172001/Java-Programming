package String;
import java.util.Arrays;
//this programme is for converting string  into string array
public class CountWords_display 
{
  public static void main(String args[])
  {
	  String s1="My name is yash gavale";
	 // String s[]=s1.split("My name is yash gavale");
	  String s2[]=StringToArray(s1);
	 //System.out.println(Arrays.toString(s2));
	  for(int i=0;i<s2.length;i++)
	  {
		  System.out.print(s2[i]+" ");
	  }
  }
  public static String[] StringToArray(String s1)
  {
	  int count=CountWords(s1);
	  String ans[]=new String[count];
	  int j=0;
	  for(int i=0;i<count;i++)
	  {
		  String temp="";
		  for(;j<s1.length();j++)
		  {
			  if(s1.charAt(j)==' ')
			  {
				  j++;
				  break;
			  }
			  else {
				  temp+=s1.charAt(j);
			  }
		  }
		  ans[i]=temp;
	  }
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
	 // System.out.println(count);
	  return count+1;
  }
}
