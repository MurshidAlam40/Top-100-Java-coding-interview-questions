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
	    
	    Solution obj = new Solution();
	    
	    StringBuffer str = new StringBuffer();
	    ArrayList<Integer> res = new ArrayList<Integer>();
	  
	    //calling leaders() function
	    res = obj.leaders(arr, n);
	    

	    for(int i=0; i<res.size(); i++){
	        System.out.print(res.get(i)+" ");
	    }
	    System.out.println();
	}
}


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        //Brute force
        /*
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int j;
            for(j=i+1; j<n; j++){
                if(arr[i] <= arr[j])
                    break;
            }
            
            if(j == n)
                ans.add(arr[i]);
        }
        
        return ans;
        */
        
        //Optimized Solution
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int rightMax = arr[n - 1];
        ans.add(arr[n - 1]);
        
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= rightMax){
                ans.add(arr[i]);
                rightMax = arr[i];
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}
