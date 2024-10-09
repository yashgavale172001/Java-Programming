package String;
import java.util.Arrays;
public class FrequencyOfWords 
{
  public static void main(String args[])
  {
	  String s="My name is My name is yash My";
	  String s1[]=s.split(" ");
	  System.out.println(Arrays.toString(s1));
	  int count[]=new int[s1.length];
	  frequencyCount(s1,count);
  }
  public static void frequencyCount(String s[],int c[])
  {
	  
	  for(int i=0;i<s.length;i++)
	  {
		  int count=1;
		  for(int j=i+1;j<s.length;j++) 
		  {
			 // System.out.println("a");
			  //System.out.println(s[i].charAt(i)+" == "+s[j].charAt(j));
			  if(s[i].equals(s[j]) && c[i]!=-1)
			  {
				  count++;
				  c[j]=-1;
				  c[i]=count;
				  //System.out.println(c[j]);
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
	  }
	 // System.out.println(Arrays.toString(c));
	  for(int i=0;i<c.length;i++)
	  {
		  if(c[i]!=-1)
		  {
			  System.out.println(s[i]+" repeated "+c[i]+" times");
		  }
	  }
  }
}
