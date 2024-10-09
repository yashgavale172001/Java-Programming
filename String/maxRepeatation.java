package String;
import java.util.Arrays;
public class maxRepeatation 
{
  public static void main(String args[])
  {
	  String s1="abcdabcddddaaernhffferrrrrrr";
	  char ch[]=s1.toCharArray();
	  Arrays.sort(ch);
	  
	  findMaxRepeat(ch);
	  //System.out.println(ch1);
  }
  public static void findMaxRepeat(char ch[])
  {
	  int i=0;
	  char c='a';
	  int count=1;
	  int max=Integer.MIN_VALUE;
	  for(;i<ch.length-1;i++)
	  {
		  //c=ch[i];
		  if(ch[i]==ch[i+1])
		  {
			  count++;
		  }
		  else {
			  if(count>max)
			  {
				  max=count;
				  c=ch[i];
			  }
			  count=1;
		  }
	  }
	  if(count>max)
	  {
		  max=count;
		  c=ch[i];
	  }
	  System.out.println(c+" repeated maximum "+max+" times ");
  }
}
