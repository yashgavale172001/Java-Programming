package Arrays;

public class Replacenonprim 
{
   public static void main(String args[])
   {
	   int a[]= {1,2,3,4,5,6,7,8};
	   int i=0;
	   for(;i<a.length;i++)
	   {
		   if(a[i]==1 || a[i]==2)
		   {
			   continue;
		   }
		   else {
			   
				   int j=2;
				   for(;j<=a[i]/2;j++)
				   {
					   if(a[i]%j==0)
					   {
						   break;
					   }
				   }
				   
				   if(j==a[i]/2+1)
				   {
					   //System.out.print("Prime "+a[i]);
					   continue;
				   }
				   else {
					   for(int x=a[i];;x++)
					   {
						   int z=2;
						   for(;z<=x/2;z++)
						   {
							   if(x%z==0)
							   {
								   break;
							   }
						   }
						   if(z==x/2+1)
						   {
							   a[i]=x;
							   break;
						   }
					   }
				   }
			   
		   }
	   }
	   for(int j=0;j<a.length;j++)
	   {
		   System.out.print(a[j]+" ");
	   }
   }
}
