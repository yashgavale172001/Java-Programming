package TCS_NQT;

import java.util.*;

import java.lang.*;

import java.io.*;

public class Main {

    public static int routerBusy(String Package, int lengthofQueue) {
        // This is default OUTPUT. You can change it.
        int result = -404;
        
        // Initialize the current queue size and the number of blinks
        int currentQueueSize = 0;
        int busyCount = 0;

        // Iterate through each log character
        for (char log : Package.toCharArray()) 
        {
            if (log == 'E') 
            {
                // Check if the queue is full
                if (currentQueueSize >= lengthofQueue) 
                {
                    busyCount++;  // Busy light blinks
                } 
                else 
                {
                    currentQueueSize++;  // Add packet to queue
                }
            } 
            else if (log == 'L') 
            {
                // Remove packet from queue (decrease size but not below 0)
                if (currentQueueSize > 0) 
                {
                    currentQueueSize--;
                }
            }
        }

        // Set the result as the number of times the busy light blinked
        result = busyCount;
        return result;
    }

    public static void main(String[] args) {
        // INPUT
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();  // Log string
        int N = sc.nextInt();      // Length of the queue

        sc.close();

        // OUTPUT
        System.out.println(routerBusy(S, N));
    }
}
