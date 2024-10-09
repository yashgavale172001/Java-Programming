package String;
import java.util.Arrays;
public class sortCharofStr 
{
  public static void main(String args[])
  {
	   String s="YAshGavale";
	   char ch[]=new char[s.length()];
	   for(int i=0;i<s.length();i++)
	   {
		   ch[i]=s.charAt(i);
	   }
	   
	   char ch2[]=sortArray(ch);
	  // int a[]= {1,2,3,4,5};
	   System.out.println(ch2);
  }
  public static char[] sortArray(char ch[])
  {
	  for(int i=0;i<ch.length-1;i++)
	  {
		  for(int j=0;j<ch.length-i-1;j++)
		  {
			  if(ch[j]>ch[j+1])
			  {
				  char temp=ch[j];
				  ch[j]=ch[j+1];
				  ch[j+1]=temp;
			  }
		  }
	  }
	  return ch;
  }
}
