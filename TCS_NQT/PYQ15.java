/*
 * Write a program that generates a password adhering to the following conditions:

* The password must consist of at least 8 characters.

* It must contain at least one integer.

* It must contain at least one special character from the set {'#', '@'}.

* It must contain at least one uppercase letter and one lowercase letter.

* Each character in the password should be incremented by the number of times specified by the second input.

Your program should take two inputs:

1. A string representing the initial password.

2. An integer representing the number of times each character should be incremented.

Your program should then generate and output the modified password.

Example 1:

Input1: werV432@

Input2: 2

Output: ygtX653#

 */
package TCS_NQT;
import java.util.Scanner;
public class PYQ15 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  int n=sc.nextInt();
	  CreatePass(s,n);
	 
  }
  public static void CreatePass(String s,int n)
  {
	  String s1="";
	  for(int i=0;i<s.length();i++)
	  {
		  char ch=s.charAt(i);
		  if(Character.isLetter(ch))
		  {
			  if(Character.isLowerCase(ch))
			  {
				  s1+=(char)(((ch-'a' + n)%26)+'a');
			  }
			  else {
				  s1+=(char)(((ch-'A' + n)%26)+'A');
			  }
		  }
		  else if(Character.isDigit(ch))
		  {
			  s1+=(char)(((ch-'0'+n)%10)+'0');
		  }
		  else {
			  if(ch=='@')
			  {
				  s1+='#';
			  }
			  else {
				  s1+='#';
			  }
		  }
		  
	  }
	  System.out.println(s1);
	 
  }
}
