// seperate repeated to one side and non repeated to another side
package Arrays;

public class RepNonRep 
{
	public static void main(String args[])
	{
		int ar[]= {10,52,2,3,4,4,5,6,6};
		int ar1[]= {10,52,2,3,4,4,5,6,6};
		//int rep[]=
		 int rep=0;
		 int nrep=0;
		 for(int i=0;i<ar.length;i++)
		 {
			 int x=ar[i];
			 int s=0;
			 for(int j=i;j<ar.length;j++)
			 {
				 if(x==ar[j] && ar[j]!=-1)
				 {
					 s++;
					 ar[j]=-1;
				 }
			 }
			 if(x!=-1 && s>1)
			 {
				 System.out.println();
				 rep++;
			 }
			 else if(x!=-1)
			 {
				 nrep++;
			 }
		 }
		// System.out.println("Repeated are "+rep);
		// System.out.println("no Repeated are "+nrep);
		 int r[]=new int[rep];
		 int a=0,b=0;
		 int nr[]=new int[nrep];
		 //System.out.println("Length of ar1 is "+ar1.length);
		 for(int i=0;i<ar1.length;i++)
		 {
			 int x=ar1[i];
			 int s=0;
			
			 for(int j=i;j<ar1.length;j++)
			 {
				 if(x==ar1[j] && ar1[j]!=-1)
				 {
					 s++;
					 ar1[j]=-1;
				 }
			 }
			// System.out.println(r.length);
			 if(x!=-1 && s>1)
			 {
				 r[a++]=x;
				 
			 }
			 
			 else if(x!=-1)
			 {
				nr[b++]=x;
				
			 }
			// System.out.println(r.length);
		 }
		 System.out.println("Repeated elements are");
		 for(int i=0;i<r.length;i++)
		 {
			 System.out.print(r[i]+" ");
		 }
		 System.out.println();
		 System.out.println("Non Repeated elements are");
		 for(int i=0;i<nr.length;i++)
		 {
			 System.out.print(nr[i]+" ");
		 }
		 
	}
  
}
