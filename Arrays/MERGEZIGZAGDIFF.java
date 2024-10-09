package Arrays;

public class MERGEZIGZAGDIFF 
{
   public static void main(String args[])
   {
	   int b[]= {1,2,3,4};
	   int a[]= {5,6,7,8,9,10};
	   
	   int c[]=new int[a.length+b.length];
	   int small=a.length>b.length?b.length:a.length;
	   int big=a.length>b.length?a.length:b.length;
	   int m=0;
	   for(int i=0;i<big;i++)
	   {
		   if(i<small)
		   {
			   c[m++]=a[i];
			   c[m++]=b[i];
			   //m++;
		   }
		   else if(a.length<b.length)
		   {
			   c[m++]=b[i];
			   //m++;
		   }
		   else {
			   c[m++]=a[i];
		   }
	   }
	   //System.out.println(Arrays.toString(c));
	   for(int i=0;i<c.length;i++)
	   {
		   System.out.print(c[i]+" ");
	   }
   }
}
