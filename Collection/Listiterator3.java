package Collection;
import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Listiterator3 

{
  public static void main(String args[])
  {
	  List<Songs> a=new ArrayList();
	  a.add(new Songs("Arijit singh","naina",15));
	  a.add(new Songs("sonali bendre","ammu",65));
	  a.add(new Songs("ajay atul","sairat",22));
	  a.add(new Songs("sunidhi chauhan","tare gin",1));
	  System.out.println(a);
	  Collections.sort(a);
	  System.out.println(a);
	  
  }
}
