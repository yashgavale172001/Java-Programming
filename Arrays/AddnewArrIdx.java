package Arrays;
import java.util.Scanner;
public class AddnewArrIdx 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int a[]= {1,2,3,4,5,6,7,8};
	   int b[]= {10,20,30,40};
	   int c[]=new int[a.length+b.length];
	   
	   int idx=sc.nextInt();
	   int v=0;
	   for(int i=0;i<c.length;i++)
	   {
		   if(i<idx)
		   {
			   c[i]=a[i];
		   }
		   else if(i>=idx && v<b.length)
		   {
			   c[i]=b[v++];
		   }
		   else {
			   c[i]=a[idx++];
		   }
	   }
	   for(int i=0;i<c.length;i++)
	   {
		   System.out.print(c[i]+" ");
	   }
    }
}
