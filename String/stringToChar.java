package String;

public class stringToChar 
{
  public static void main(String args[])
  {
	  String s="yash";
	  char ch[]=new char[s.length()];
	  int ar[]= {1,2,3,4,5};
	  for(int i=0;i<ch.length;i++)
	  {
		  ch[i]=s.charAt(i);
	  }
	  System.out.println(ch);
	 // System.out.println(ar);
  }
}
