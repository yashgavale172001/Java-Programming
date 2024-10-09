/*
 * given size of n and list of array elements and we should print if the given element in array is divisible by 3 then replace the element with "Three" and if the element in array is divisible by 5 then replace the element with "Five" if the element divisible by 3 and 5 both then replace the element with "ThreeFive" if the element in the array is not satisfying the above 3 conditions then put the element as it is and print the array

Example 1:

Input: N=4

[2 3 4 5]

Output: 2 Three 4 Five;

Example 2: Input: N=2 [15 3] Output: ThreeFive Three 
 */

package TCS_NQT;
import java.util.Scanner;
public class PYQ16 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  sc.nextLine();
	  String s=sc.nextLine().replaceAll("[\\[\\]]","");
	  String s1[]=s.split(" ");
	  int arr[]=new int[s1.length];
	  for(int i=0;i<s1.length;i++)
	  {
		  arr[i]=Integer.parseInt(s1[i]);
	  }
	  
	  replace(arr);
  }
  public static void replace(int arr[])
  {
	  String s="";
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]%3==0 && arr[i]%5==0)
		  {
			  s+="ThreeFive"+" ";
		  }
		  else if(arr[i]%3==0)
		  {
			  s+="Three"+" ";
		  }
		  else if(arr[i]%5==0){
			  s+="Five"+" ";
		  }
		  else {
			  s+=arr[i]+" ";
		  }
	  }
	  s.trim();
	  System.out.println(s);
  }
}
