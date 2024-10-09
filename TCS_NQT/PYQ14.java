/*
 * Write a program to take input of X and Y in a new line. Print the number which is nearer the integer when divided by Y.

Example 1:

Input:

x = 13

Y = 3

Output: 12

Example 2:

Input: x = 12

v = 2

Output: 12
 */
package TCS_NQT;
import java.util.Scanner;
public class PYQ14 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   
	   int n=x/y;
	   System.out.println(y*n);
   }
}
