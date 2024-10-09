package String;

public class charToString 
{
   public static void main(String args[])
   {
	   char ch[]= {'a','d','f','g'};
	/*1st way*/   String s=new String(ch);//this will convert character array in string but for string to char array we need for loop
	/*2nd way*/   String s2=String.valueOf(ch);
	/*3rd way*/  String s3="";
	   for(int i=0;i<ch.length;i++)
	   {
		   s3+=ch[i];
	   }
	   System.out.println(s);
	   System.out.println(s2);
	   System.out.println(s3);
   }
}
