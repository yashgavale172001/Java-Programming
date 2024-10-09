/*In a database there are N students .the fields of the table are  name,age,grade,gender  ,
 * your task is to return the students name who are greater than 20 years old and calculate the average of 
 * grades using ascii value of female candidates

Input :3
AAA 21 A Female
BBB 22  B Male
CCC 24 C Female

Output :
AAA BBB CCC
66*/
package TCS_NQT;
import java.util.Scanner;
public class PYQ8 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the num of ip");
	  int num=sc.nextInt();
	  String s[]=new String[num];
	  double f=0;
	  double t=0;
	  for(int i=0;i<num;i++)
	  {
		  int max=Integer.MIN_VALUE;
		  System.out.println("enter name");
		  String name=sc.next();
		  System.out.println("enter age");
		  int age=sc.nextInt();
		  System.out.println("enter grade");
		  char grade=sc.next().charAt(0);
		  System.out.println("enter gender");
		  String gender=sc.next();
		 
		 // System.out.println(t);
		  if(age>20)
		  {
			  s[i]=name;
		  }
		  if(gender.equals("Female"))
		  {
			  t=grade+t;
			  f++;
			 // System.out.println(f);
		  }
		  
	  }
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i]!=null)
		  {
			  System.out.print(s[i]+" ");
		  }
	  }
	  System.out.println();
	  System.out.print(t/f);
	  
  }
}
