package TCS_NQT;

public class PYQ6 
{
	
	/*public static void main(String[] args) 
	{
        int[] arr = {1, 1,2};
        printSubarrays(arr);
    }

    public static void printSubarrays(int[] arr) 
    {
        int n = arr.length;

        // Generate all possible subarrays
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j++) 
            {
                // Print each subarray
               // System.out.print("[");
            	int count=0;
            	for (int k = i; k <= j; k++) 
                {
                    count++;
                }
            	int a[]=new int[count];
            	int result=0;
                for (int k = i; k <= j; k++) 
                {
                	result=result | arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("bitwise is "+result);
                System.out.println(" ");
            }
        }
    }*/
	public static void printSubarrays(int[] arr) {
        int n = arr.length;

        // Loop to pick the starting point
        for (int i = 0; i < n; i++) {
            
            String s="";
            // Loop to pick the ending point
            for (int j = i; j < n; j++) 
            {
                
//                if (j > i) 
//                {
//                   
//                    s+=" ";
//                }
               
                s+=arr[j];
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5};

        System.out.println("Subarrays of the given array are:");
        printSubarrays(arr);
    }
	
}
