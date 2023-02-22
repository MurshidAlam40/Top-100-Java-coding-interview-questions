import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		Scanner sc = new Scanner(System.in);
	   
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    
	    int arr [] = new int[N];
	    
	    for(int i=0; i<N; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	   
	    int res = lenOfLongSubarr(arr, N, K);
	    
	    System.out.println(res);
	}
}

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        /*
        int maxLength = 0;
        
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=i; j<N; j++){
                sum += A[j];
                if(sum == K){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        
        
        for(int i = 0; i < N; i++) {
            sum += A[i];
          
            if(sum == K){
              maxLength = i + 1;
            }
            if(!map.containsKey(sum)) {
              map.put(sum, i);
            }
          
            if(map.containsKey(sum - K)) {
                if (maxLength < (i - map.get(sum - K))){
                    maxLength = i - map.get(sum - K);
                }
            }
        }
        return maxLength;      
    }
}


