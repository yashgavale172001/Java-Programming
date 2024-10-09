package TCS_NQT;
import java.util.Scanner;
public class PYQ2 
{
  
	  
		    public static void main(String[] args) 
		    {
		        System.out.println(uniquePaths(3, 7));  // Output: 28
		    }

		    public static int uniquePaths(int m, int n) 
		    {
		        int[][] dp = new int[m][n];

		        // Initialize first row and column to 1
		        for (int i = 0; i < m; i++) 
		        {
		            dp[i][0] = 1;
		        }
		        
		        for (int j = 0; j < n; j++) 
		        {
		            dp[0][j] = 1;
		        }

		        // Fill in the rest of the grid
		        for (int i = 1; i < m; i++) 
		        {
		            for (int j = 1; j < n; j++) 
		            {
		                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
		            }
		        }

		        return dp[m - 1][n - 1];
		    }
		
  
}
