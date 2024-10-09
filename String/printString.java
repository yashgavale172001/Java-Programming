package String;

public class printString 
{
  public static void main(String args[])
  {
	  String s="Hello";
	  String s2="Hello";
//	  System.out.println(s.toString());
//	  System.out.println(s2.toString());
//	  System.out.println(s.hashCode());
//	  System.out.println(s2.hashCode());
	  System.out.println(s==s2);
	  String a=new String("Hello");
	  //int a=10;
	  String a1=new String("Hello");
//	  System.out.println(a.toString());
//	  System.out.println(a1.toString());
	  
	  System.out.println(a.hashCode());
	  System.out.println(a1.hashCode());
	  System.out.println(a==a1); // it compares the reference
	  System.out.println(a.equals(a1)); //it compares hashcode
	  
  }
}
