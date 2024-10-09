package String;
import java.util.Arrays;
public class frequencyOfChar 
{
  public static void main(String args[])
  {
	  String s="abababccdaerrrr";
	  char ch[]=s.toCharArray();
	  Arrays.sort(ch);
	  int i=0;
	  int count=1;
	  for(;i<ch.length-1;i++)
	  {
		  
		  if(ch[i]==ch[i+1])
		  {
			  count++;
		  }
		  else {
			  System.out.println(ch[i]+" repeated "+count);
			  count=1;
		  }
	  }
	  System.out.println(ch[i]+" repeated "+count);
  }
}
