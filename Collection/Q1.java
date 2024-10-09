package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.ListIterator;
public class Q1 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  List<Integer> a=new ArrayList();
	  a.add(10);
	  a.add(8);
	  a.add(32);
	  a.add(12);
	  a.add(6);
	  a.add(87);
	  ListIterator list=a.listIterator();
	  System.out.println(a);
	  
//	  System.out.println("Enter which indexs you want to swap");
//	  int b=sc.nextInt();
//	  int c=sc.nextInt();
//	  
//	  int temp=a.get(b);
//	  a.set(b,a.get(c));
//	  a.set(c,temp);
//	  System.out.println(a);
//	  
//	  Collections.swap(a, c, b);
//	  System.out.println(a);
	  
	  System.out.println("Enter the number to find its index");
	  int n=sc.nextInt();
	  while(list.hasNext())
	  {
		  if(list.next()==(Integer)n)
		  {
			  System.out.println(list.previousIndex());
			  break;
		  }
	  }
	 System.out.println(a.indexOf(32));
	  
	  
  }
}
