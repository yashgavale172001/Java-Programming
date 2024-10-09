package Collection;
import java.util.ArrayList;
public class AddArrayList 
{
  public static void main(String args[])
  {
	  ArrayList<Integer> a= new ArrayList();
	  a.add(10);
	  a.add(12);
	  a.add(1);
	  a.add(2);
	  a.add(34);
	  a.add(23);
	  //a.add("Yash");
//	  for(Object o:a)
//	  {
//		  System.out.println(o);
//		  if(o==(Integer)2)
//		  {
//			  a.remove((Integer)2);   //we cannot remove elements
//		  }
//	  }
	 // System.out.println();
	  for(int o:a)
	  {
		  System.out.println(o);
	  }
    // System.out.println(a);
	 
  }
}
