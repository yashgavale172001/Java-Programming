package TCS_NQT;
//kadans algorithm to find max sum of subarrays
import java.util.Scanner;
public class PYQ17 
{
	 public static void main(String[] args) 
	 {
	        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int[] nums2 = {5, 4, -1, 7, 8};

	        System.out.println("Largest sum of subarray for nums1: " + maxSubArray(nums1));
	        System.out.println("Largest sum of subarray for nums2: " + maxSubArray(nums2));
	 }

	    public static int maxSubArray(int[] nums) 
	    {
	        int maxSoFar = nums[0];
	        int maxEndingHere = nums[0];

	        for (int i = 1; i < nums.length; i++) 
	        {
	            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);
	        }

	        return maxSoFar;
	    }
}
