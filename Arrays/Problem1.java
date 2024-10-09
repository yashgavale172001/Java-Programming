package Arrays;

public class Problem1 
{
   public static void main(String args[])
   {
	   int ar[]= {3,1,2,5,2};
	   int dp=duplicate(ar);
	   int n=nextInt(ar,dp);
	   System.out.print(dp+" ");
	   System.out.print(n);
   }
   public static int nextInt(int ar[],int dp)
   {
	   int sum=0;
	   for(int i=0;i<ar.length;i++)
	   {
		   if(ar[i]!=dp)
		   {
			   sum+=ar[i];
		   }
		   
	   }
	   sum+=dp;
	   
	   float n=((float)ar.length/2)*(2*1 +(ar.length-1)*1);
	   //System.out.println(n);
	   int total=(int)n-sum;
	   return total;
   }
   public static int duplicate(int ar[])
   {
	  
	   for(int i=0;i<ar.length;i++)
	   {
		   int x=0;
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]==ar[j])
			   {
				   x++;
				   break;
			   }
		   }
		   if(x>0)
		   {
			   int n=ar[i];
			   return n;
		   }
	   }
	   return 0;
   }
}
