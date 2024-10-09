package TCS_NQT;
import java.util.*;
import java.lang.*;
//import (link unavailable)*;
import java.io.*;
public class TechM 
{
  
	

	

	    public static int[] funcDistance(int[] inputDist, int start, int end) 
	    {
	        // Create a list to hold distances within the range
	        ArrayList<Integer> withinRange = new ArrayList<>();

	        // Iterate through each distance and check if it falls within the range
	        for (int dist : inputDist) {
	            if (dist >= start && dist <= end) {
	                withinRange.add(dist);
	            }
	        }

	        // If no distances fall within the range, return an array with -1
	        if (withinRange.isEmpty()) {
	            return new int[]{-1};
	        }

	        // Convert the list to an array and return
	        int[] result = new int[withinRange.size()];
	        for (int i = 0; i < withinRange.size(); i++) {
	            result[i] = withinRange.get(i);
	        }

	        return result;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);

	        // Input for inputDist
	        int inputDist_size = in.nextInt();
	        int inputDist[] = new int[inputDist_size];

	        for (int idx = 0; idx < inputDist_size; idx++) {
	            inputDist[idx] = in.nextInt();
	        }

	        // Input for start
	        int start = in.nextInt();

	        // Input for end
	        int end = in.nextInt();

	        int[] result = funcDistance(inputDist, start, end);
	        for (int idx = 0; idx < result.length - 1; idx++) {
	            System.out.print(result[idx] + " ");
	        }

	        // Print the last element without trailing space
	        System.out.print(result[result.length - 1]);
	    }
	
	  
 }

