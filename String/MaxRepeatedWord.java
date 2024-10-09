package String;
import java.util.Scanner;
public class MaxRepeatedWord 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s=sc.nextLine();
	  String s1[]=s.split(" ");
	  int count[]=new int[s1.length];
	  countMax(s1,count);
  }
  public static void countMax(String s[],int c[])
  {
	  int max=Integer.MIN_VALUE;
	  int x=0;
	  for(int i=0;i<s.length;i++)
	  {
		  int count=1;
		  for(int j=i+1;j<s.length;j++)
		  {
			  if(s[i].equals(s[j]) && c[i]!=-1)
			  {
				  count++;
				  c[j]=-1;
				  c[i]=count;
				  
			  }
			  else if(c[i]==-1)
			  {
				  break;
			  }
			  
		  }
		  if(c[i]!=-1 && count==1)
		  {
			  c[i]=count;
		  }
		  if(count>max)
		  {
			  max=count;
			  x=i;
		  }
	  }
	  System.out.println(s[x]+" Repeated "+c[x]+" times");
  }
}
