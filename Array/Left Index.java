import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int arr[]= new int[N];
        
        for(int i = 0; i < N; i++){
          arr[i] = sc.nextInt();
        }
        
        int X = sc.nextInt();
        
        System.out.println(new LeftIndex().leftIndex(N, arr, X));
    }
}

class LeftIndex{ 

    static int leftIndex(int N, int arr[], int X){
       
       // Your code here
        int low = 0;
        int high = N-1;
        int ans = -1;
        
        while(low <= high){
                                                  
            int mid = low + ((high - low)/2);
            // if element is equal to arr[mid] and arr[mid-1] < element to search
            // element is found, add in ans and break the loop
            if(arr[mid] == X && (mid == 0 || arr[mid-1] < X)){
                ans = mid;
                break;
            }
            
            // if X > middle of current array,
            // go for higher part of array
            if(X > arr[mid]){
                low = mid+1;
            }
            // if X < middle of current array,
            // go for lower part of array
            else{
                high = mid - 1;
            }
            
        }
        // if element is not there in the array, return false
        return ans;
    }
}

