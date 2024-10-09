package String;

public class removeDuplicateWord 
{
  public static void main(String args[])
  {
	  String s="yash yash gavale is gavale";
	  String s1[]=s.split(" ");
	  int count[]=new int[s1.length];
	  RemoveDuplicate(s1,count);
  }
  public static void RemoveDuplicate(String s[],int count[])
  {
	  String ans="";
	  for(int i=0;i<s.length;i++)
	  {
		  int ct=1;
		  //String ans="";
		  for(int j=i+1;j<s.length;j++)
		  {
			  if(s[i].equals(s[j]) && count[i]!=-1)
			  {
				  ct++;
				  count[j]=-1;
				  count[i]=ct;
			  }
			  else if(count[i]==-1)
			  {
				  break;
			  }
		  }
		  if(count[i]!=-1 && ct==1)
		  {
			  count[i]=ct;
		  }
		  if(count[i]!=-1)
		  {
			  ans+=s[i]+" ";
		  }
	  }
	  System.out.println(ans);
  }
}
