package TCS_NQT;
//given an array nums of size n ,return the majority elements, the majority element is the element that appears
//more than n/3 times you may assume that the majority element always exist in an array
//ip :nums=[3,2,3,3]
//op: 3

import java.util.Scanner;
public class PYQ11 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine().replaceAll("[\\[\\]]","");
	   String s1[]=s.split(",");
	   int arr[]=new int[s1.length];
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=Integer.parseInt(s1[i]);
	   }
	   
	   findmax(arr);
   }
   public static void findmax(int arr[])
   {
	   int count[]=new int[arr.length];
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   int ct=1;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]==arr[j] && count[i]!=-1)
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
	   }
	   
	   for(int i=0;i<count.length;i++)
	   {
		   if(count[i]!=-1 && count[i]>(arr.length/3))
		   {
			   System.out.println(arr[i]);
		   }
	   }
   }
}
