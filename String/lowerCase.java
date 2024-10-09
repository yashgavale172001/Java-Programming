package String;

public class lowerCase 
{
  public static void main(String args[])
  {
	  String s1="ABCDEFG";
	  char ch[]=new char[s1.length()];
	  
	  for(int i=0;i<s1.length();i++)
	  {
		  ch[i]=s1.charAt(i);
	  }
	  char ch1[]=convert(ch);
	  String s2=new String(ch1);
	  System.out.println(s2);
  }
  public static char[] convert(char ch[])
  {
	  for(int i=0;i<ch.length;i++)
	  {
		  if(ch[i]<=90)
		  {
			  ch[i]+=32;
		  }
	  }
	  return ch;
  }
}
