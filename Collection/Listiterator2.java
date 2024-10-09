package Collection;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;
public class Listiterator2 
{
  public static void main(String args[])
  {
	 List<String> l=new ArrayList();
	  l.add("yash");
	  ListIterator<String> list=l.listIterator(); //always create an iterator after adding element in an arraylist
	 // list.next();
	  System.out.println(l);
	 // list.next();
	  list.add("vhc");
	  list.add("vkc");
	  list.add("vh");
	  l.add(" ghsfd");
	  //list.add("def");
	  l.add(" ghsfd");
	  l.add(" ghs");
	  l.add(" ghffd");
	  l.add(" ghsfd");
	  l.add(" gmsfd");
	  System.out.println(l);
	 // System.out.println(list);
	  
  }
}
