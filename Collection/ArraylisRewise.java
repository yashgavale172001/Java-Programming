package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ArraylisRewise 
{
   public static void main(String args[])
   {
//	   List<Integer> li=new ArrayList();
//	   
//	   li.add(10);
//	   li.add(56);
//	   li.add(45);
//	  // System.out.println(li);
//	   ListIterator<Integer> ltr=li.listIterator(li.size());
//	   
//	   while(ltr.hasPrevious())
//	   {
//		   System.out.println(ltr.previous());
//	   }
	   List<Integer> a=new ArrayList();
	   a.add(4);
	   a.add(34);
	   a.add(9);
	   a.add(2);
	   
	   ListIterator li=a.listIterator(2); 
	   
	   while(li.hasNext())
	   {
		   System.out.println(li.next());
	   }
   }
}
