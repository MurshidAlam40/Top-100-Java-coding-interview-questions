//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array{
    
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	   
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    int ans = new Solution().countZeroes(arr, n);
        System.out.println(ans);
	}
}


class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int ans = 0;
        int low = 0;
        int high = n - 1;
        while(low <= high){ 
            // get the middle index
            int mid = (low + high) / 2;
            
            if(arr[mid] == 1){
                ans = n - mid;
                high = mid -1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
}
