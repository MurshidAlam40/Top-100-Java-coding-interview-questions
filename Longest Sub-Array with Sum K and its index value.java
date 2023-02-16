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

   
    
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        
        int maxLength = 0;
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=i; j<N; j++){
                sum += A[j];
                if(sum == K){
                    maxLength = Math.max(maxLength, j-i+1);
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println(index1+" "+index2);
        return maxLength;
        
    }
}


