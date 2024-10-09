package TCS_NQT;
import java.util.Arrays;
public class AsteroidProblem 
{
   public static void main(String args[])
   {
	  String s="un*nbee****rrrr**yz*";
	  String s1=Asteroid(s);
	  ///s1.reverse();
	  String s2="";
	  for(int i=s1.length()-1;i>=0;i--)
	  {
		  s2+=s1.charAt(i);
	  }
	  System.out.println(s2);
	   
   }
   public static String Asteroid(String a)
   {
	   String s="";
	   int count=0;
	   for(int i=a.length()-1;i>=0;i--)
	   {
		   char c=a.charAt(i);
		   if(c=='*')
		   {
			   count++;
		   }
		   else if(count>0)
		   {
			   count--;
		   }
		   else {
			   s+=c;
		   }
	   }
	   return s;
   }
}
