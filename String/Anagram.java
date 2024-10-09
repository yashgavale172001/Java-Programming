package String;

public class Anagram 
{
  public static void main(String args[])
  {
	  String s1="bhaiyaa";
	  String s2="bhaiya";
	  if(isAnagram(s1,s2))
	  {
		  System.out.println(s1+" and "+s2+" are anagrams");
	  }
	  else {
		  System.out.println(s1+" and "+s2+" are not anagrams");
	  }
  }
  public static boolean isAnagram(String s1,String s2)
  {
	  if(s1.length()==s2.length())
	  {
		  char ch[]=StringToChar(s1);//charch[]=s1.toCharArray();
		  char ch1[]=StringToChar(s2);//charch[]=s1.toCharArray();
		  sort(ch);
		  sort(ch1);
		  int i=0;
		  for(;i<ch.length;i++)
		  {
			  if(ch[i]!=ch1[i])
			  {
				  break;
			  }
		  }
		  if(i==ch.length)
		  {
			  return true;
		  }
		  else {
			  return false;
		  }
		  
	  }
	  else {
		  return false;
	  }
	 
	  
	  
  }
  public static char[] StringToChar(String s)
  {
	  char ch[]=new char[s.length()];
	  
	  for(int i=0;i<s.length();i++)
	  {
		  ch[i]=s.charAt(i);
	  }
	  return ch;
  }
  public static void sort(char ch[])
  {
	  for(int i=0;i<ch.length-1;i++)
	  {
		  for(int j=0;j<ch.length-i-1;j++)
		  {
			  if(ch[j]>ch[j+1])
			  {
				  char c=ch[j];
				  ch[j]=ch[j+1];
				  ch[j+1]=c;
			  }
		  }
	  }
  }
}
