package TCS_NQT;
import java.util.Scanner;
public class String_To_Int_Array 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter elements in the format of {1,2,3,4,5}");
	  String s=sc.nextLine().replaceAll("[\\{\\}]", "");
	  String s1[]=s.split(",");
	  int arr[]=new int[s1.length];
	  for(int i=0;i<s1.length;i++)
	  {
		  arr[i]=Integer.parseInt(s1[i]);
	  }
	  for(int i=0;i<s1.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	  
  }
}
