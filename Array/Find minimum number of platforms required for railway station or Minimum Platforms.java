//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String str[] = read.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        
        int arr[] = new int[n];
        int dep[] = new int[n];
        
        str = read.readLine().trim().split(" ");
        
        for(int i = 0; i < n; i++){
          arr[i] = Integer.parseInt(str[i]);
        }
        
        str = read.readLine().trim().split(" ");
        for(int i = 0; i < n; i++){
            dep[i] = Integer.parseInt(str[i]);
        }
            
        System.out.println(new Solution().findPlatform(arr, dep, n));
    }
    
    
}


class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        /*
        //Brute Force
        // plat_needed indicates number of platforms
        // needed at a time
        int platNeeded = 0;
        int maxPlat = 0;
        // run a nested  loop to find overlap
        for(int i=0; i<n; i++){
            // minimum platform
            platNeeded = 1;
            for(int j=0; j<n; j++){
                if(i != j){
                    // check for overlap
                    if(arr[i] >= arr[j] && dep[j] >= arr[i])
                        platNeeded++;
                }
            }
            // update result
            maxPlat = Math.max(maxPlat, platNeeded);
        }
        return maxPlat;
        */
        
        //Greedy Method;
        // plat_needed indicates number of platforms
        // needed at a time
        int platNeeded = 0;
        int maxPlat = 0;
        // Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);
        //use two pointer
        int i = 0;
        int j = 0;
        
        while(i<n && j<n){
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if(arr[i] <= dep[j]){
                platNeeded++;
                i++;
            }
             // Else (arr[i] > dep[j]) decrement count of platforms needed
            else{
                platNeeded--;
                j++;
            }
             // Update result if needed
            maxPlat = Math.max(maxPlat, platNeeded);
        }
        return maxPlat;
    }
}

