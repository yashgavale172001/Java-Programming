package Collection;

import java.util.ArrayList;

public class Arraylist1 
{
  public static void main(String args[])
  {
	  ArrayList a1=new ArrayList();
	  
	  a1.add(10);
	  a1.add("10");
//	  a1.add(true);
//	  a1.add(new int[3]);
	  
//	  for(int i=0;i<a1.size();i++) {
//		  System.out.println(a1.get(i));
//	  }
	  for(Object i:a1)
	  {
		  System.out.println(i.toString());
	  }
  }
}
