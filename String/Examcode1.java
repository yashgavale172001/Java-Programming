/*
 You are tasked with developing an e-commerce application that incorporates a notification system capable of sending various types of notifications to users induding email notifications,SMS and push. To ensure efficient and maintainable code, you need to define a common template that outlines the basic steps for sending notifications This template should be implemented by classes specific to each type of notification, thereby promoting code reuse and enforcing a consistent algorithm structure across multiple notification methods

Input:

Single line containing the input input (Email | Mobile number | Userid)

Output:

Single line displaying the type of notification and notification content

Output should be in this format. This is a/an <email/sms/push notification. Sending <emall/sms/push notification> to <input>

Example:

Sample Input:

xyz@gmail.com

Sample Output:

This is an email notification. Sending email to xyz@gmail.com

Structure of code is 

public class Solution {

public static String send_notification(String input) {

String notification = "";

//write your code here

//Do not change the existing code

return notification;

}
}
 */

//code

/*
 class Solution {

    public String longestPalindrome(String input_str) {
        String result = "";

        if (input_str == null || input_str.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < input_str.length(); i++) {
            int len1 = expandAroundCenter(input_str, i, i);   // Odd length palindrome
            int len2 = expandAroundCenter(input_str, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        result = input_str.substring(start, end + 1);

        return result;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        String input1 = "babad";
        System.out.println(sol.longestPalindrome(input1));  // Output: "bab" or "aba"

        // Test case 2
        String input2 = "cbbd";
        System.out.println(sol.longestPalindrome(input2));  // Output: "bb"
    }
}
 */

package String;

/*public class Examcode1 
{
  
}*/
