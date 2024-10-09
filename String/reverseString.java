package String;
//reverse the string
public class reverseString 
{
   public static void main(String args[])
   {
	   String s="Prime to chahiye bhai";
	   char ch[]= new char[s.length()];
	   for(int i=0;i<s.length();i++)
	   {
		   ch[i]=s.charAt(i);
	   }
	  // char ch1[]=s.toCharArray(); //use to convert String into character array
       char ch1[]=reverse(ch);
       String s1=new String(ch1);
       System.out.println(s1);
   }
   public static char[] reverse(char ch[])
   {
	   for(int i=0;i<=(ch.length)/2;i++)
	   {
		   char c=ch[i];
		   ch[i]=ch[ch.length-i-1];
		   ch[ch.length-i-1]=c;
	   }
	   return ch;
	   
   }
}
