package TCS_NQT;
//you have given a shoes like 7L 8R 7L 7R you need to print the how many pairs can be possible 
//this is not proper code
import java.util.Scanner;
public class PYQ10 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the shoes");
	  int n=sc.nextInt();
	  int count=0;
	  String s[]=new String[n];
	 // String s1[]=new String[n];
	  for(int i=0;i<n;i++)
	  {
		  s[i]=sc.next();
	  }
	  
	  for(int i=0;i<n;i++)
	  {
		  if(s[i]!="-1")
		  {
			  for(int j=i+1;j<n;j++)
			  {
				  if(s[i].charAt(0)==s[j].charAt(0) && (s[i].charAt(1)=='L' && s[j].charAt(1)=='R') || (s[i].charAt(1)=='R' && s[j].charAt(1)=='L'))
				  {
					  count++;
					  s[i]="-1";
					  s[j]="-1";
					  break;
				  }
			  }
		  }
		  
	  }
	  System.out.println(count);
  }
}
