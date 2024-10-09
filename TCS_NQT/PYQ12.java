package TCS_NQT;
/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 3, 6 and 7 to represent the color red, white, and

blue, respectively. You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [3,6,3,7,6,3,7]

Output: 3 3 3 6 6 7 7*/
import java.util.Scanner;
public class PYQ12 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine().replaceAll("[\\[\\]]", "");
	  String s1[]=s.split(",");
	  int ar[]=new int[s1.length];
	  for(int i=0;i<ar.length;i++)
	  {
		  ar[i]=Integer.parseInt(s1[i]);
	  }
	  
	  sort(ar);
  }
  public static void sort(int ar[])
  {
	  int three=0,six=0,seven=0;
	  int x=0;
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]==3)
		  {
			  three++;
		  }
		  else if(ar[i]==6)
		  {
			  six++;
		  }
		  else if(ar[i]==7)
		  {
			  seven++;
		  }
	  }
	  for(int i=0;i<ar.length;i++)
	  {
		  if(i<three)
		  {
			  ar[i]=3;
			  x=i;
		  }
		  else if(i>=three && i<=x+six)
		  {
			  ar[i]=6;
		  }
		  else {
			  ar[i]=7;
		  }
	  }
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
  }
}
