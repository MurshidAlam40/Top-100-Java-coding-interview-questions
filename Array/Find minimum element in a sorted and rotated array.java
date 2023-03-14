import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int A[] = new int[n];
        
        for (int i = 0;i < n;i++)
        {
            A[i] = sc.nextInt();
        }
        
        Solution sol = new Solution();
        System.out.println(sol.findMin(A, n));
    }
}


class Solution{
    int findMin(int arr[], int n){
        //complete the function here
        // using sort method
        /*
        Arrays.sort(arr);
        
        return arr[0];
        */
        //using for loop
        /*
        int min = arr[0];
        
        for(int i=0; i<n; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
        */
        //Using while loop
        /*
        int min = arr[0];
        int i = 0;
        
        while(i < n){
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        return min;
        */
        //more optimize solution
        int start = 0;
        int end = n-1;
        
        while(start < end){
            int mid = start + ((end-start)/2);
            
            if(arr[mid] > arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
}
