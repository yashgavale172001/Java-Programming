package String;
import java.util.Arrays;
public class AnagramWithoutNested 
{
  public static void main(String args[])
  {
	  String s1="yash gavale";
	  String s2="yash gavale";
	  char ch[]=new char[127];
	  char ch1[]=new char[127];
	  
	  for(int i=0;i<s1.length();i++)
	  {
		  ch[s1.charAt(i)]++;
		  ch1[s2.charAt(i)]++;
	  }
	  //System.out.println(Arrays.toString(ch));
	  //System.out.println(Arrays.toString(ch1));
	  int i=0;
	  for(;i<ch1.length;i++)
	  {
		  if(ch[i]!=ch1[i])
		  {
			  break;
		  }
	  }
	  if(i==ch1.length)
	  {
		  System.out.println("anagram");
	  }
	  else {
		  System.out.println("not anagram");
	  }
  }
}
