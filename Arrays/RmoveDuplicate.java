package Arrays;

import java.util.Arrays;

public class RmoveDuplicate 
{
//    public static void main(String args[])
//    {
//    	int arr[]= {10,6,2,8,6,10,3,4,3};
//    	Arrays.sort(arr);
//    	printOccurences(arr);
//    	
//    }
//    public static void printOccurences(int arr[])
//    {
//    	int count=1;
//    	int i;
//    	for( i=1;i<arr.length;i++)
//    	{
//    		if(arr[i]==arr[i-1])
//    		{
//    			count++;
//    		}
//    		else 
//    		{
//    			System.out.println(arr[i-1]+" occurs "+count+" times ");
//    			count=1;
//    		}
//    	}
//    	System.out.println(arr[i-1]+" Occurs "+count+ " times");
//    }
	
	public static void main(String args[])
	{
		int ar[]= {10,23,11,54,23,11,23};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		occurence(ar);
	}
	public static void occurence(int ar[])
	{
		int count=1;
		int i=1;
		for(;i<ar.length;i++)
		{
			if(ar[i]==ar[i-1])
			{
				count++;
			}
			else {
				System.out.println(ar[i-1]+" Element Repeated "+count+" times ");
				count=1;
			}
		}
		System.out.println(ar[i-1]+" Element Repeated "+count+" Times");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












































//public static void main(String[] args) {
//    int[] array = {10,7,23,8,23,17,10,8,23,23,7};
//    Arrays.sort(array);
//    countOccurrences(array);
//}
//
//public static void countOccurrences(int[] array) 
//{
//    int n = array.length;
//    int count = 1;
//
//    for (int i = 1; i < n; i++) 
//    {
//        if (array[i] == array[i - 1]) 
//        {
//            count++;
//        } 
//        else 
//        {
//            System.out.println("Element " + array[i - 1] + " occurs " + count + " times.");
//            count = 1;
//        }
//    }
//
//    // Print the count for the last element
//    System.out.println("Element " + array[n - 1] + " occurs " + count + " times.");
//}