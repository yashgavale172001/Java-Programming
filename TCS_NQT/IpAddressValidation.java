package TCS_NQT;

public class IpAddressValidation 
{
   public static void main(String args[])
   {
	   String s="000.129.76.034";
	   String s1[]=s.split("\\.");
	   if(s1.length==4)
	   {
		   try {
			   int i=0;
			   for(;i<s1.length;i++)
			   {
				   int num=Integer.parseInt(s1[i]);
				   if(s1[i].length()>3)
				   {
					   System.out.println("not valid ip");
					   break;
				   }
			   }
			   if(i==s1.length)
			   {
				   System.out.println("valid ip");
			   }
		   }
		   catch(NumberFormatException ne)
		   {
			   System.out.println("num format exception not valid ip");
		   }
		   
	   }
	   else {
		   System.out.println("its not ip address");
	   }
   }
}
