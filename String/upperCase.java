package String;

public class upperCase 
{
  public static void main(String args[])
  {
	  String s="abcdefghijklmnopqrstuvwxyz";
	  char ch[]=s.toCharArray();
	  char ch1[]=convert(ch);
	  String s2=new String(ch1);
	  System.out.println(s2);
	  
  }
  public static char[] convert(char ch[])
  {
	  for(int i=0;i<ch.length;i++)
	  {
		  if(ch[i]>95)
		  {
			  ch[i]-=32;
		  }
	  }
	  return ch;
  }
}
