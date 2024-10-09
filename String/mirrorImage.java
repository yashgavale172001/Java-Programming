package String;
//check particular image is mirror image or not
public class mirrorImage 
{
   public static void main(String args[])
   {
	   String s="Yashgavale";
	   String s2="elavaghsaY";
	   
	   if(s.length()==s2.length())
	   {
		   int i=0;
		   for(;i<s.length();i++)
		   {
			   if(s.charAt(i)!=s2.charAt(s2.length()-i-1))
			   {
				   break;
			   }
           
		   }
		   if(i==s.length())
		   {
			   System.out.println(s+" is mirror image of "+s2);
		   }
		   else {
			   System.out.println(s+" is not mirror image of "+s2);
		   }
	   }
	   else {
		   System.out.println(s+" is not mirror image of "+s2);
	   }
   }
}
