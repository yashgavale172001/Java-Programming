package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class ArrayList_ITERATOR 
{
   public static void main(String args[])
   {
	   List<Integer> a=new ArrayList();
	  // Iterator<Integer> i=a.iterator(); //ArrayList iterator cannot access the elements in reverse order
	   //we cannot remove elements from collection during iteration we get concurrent modification exception
	   a.add(10);
	   a.add(18);
	   a.add(1);
	   a.add(19);
	   ListIterator i=a.listIterator(); //ArrayList iterator cannot access the elements in reverse order
	   //we cannot remove elements from collection during iteration we get concurrent modification exception
	   //it has just two methods 1:next() 2:hasNext()
	   //a.remove(2);
	  // i.remove(); it will delete the element which is returned by i.next() ,it is mostly used in fro each loop
	   System.out.println(a);
//	   while(i.hasNext())
//	   {
//		   System.out.println(i.next());
//	   }
	   a.remove(1); //never remove element from arraylist using arraylist method always use ListIterator
	  System.out.println(a.get(1));
	   //System.out.println(i.next());
	   for(Integer o:a)
	   {
		   System.out.print(o+" ");
		  //System.out.println(i.next());
	   }
	   System.out.println();
	   for(int c=0;c<a.size();c++)
	   {
		   System.out.print(a.get(c)+" ");
	   }
	   while(i.hasNext()) //will get concurrent modification exception if you remove element with the help of arraylist method 
		                  // and use to iterate over arralist using iterator 
	   {
		   System.out.print(i.next()+" ");
	   }
	  // System.out.println(a);
	   
;   }
}
