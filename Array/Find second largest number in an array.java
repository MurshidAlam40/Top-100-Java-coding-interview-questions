import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int ans = new Solution().print2largest(arr, n);
        System.out.println(ans);
    }
}


class Solution {
    int print2largest(int arr[], int n) {
        // code here
        /*
        Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1])
                return arr[i];
        }
        return -1;
        */
        // Second Method
        /*
        int largest = Integer.MIN_VALUE;
        int secondLargest = -1;
        // Find the largest element
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }
        // Find the second largest element
        for(int i=0; i<n; i++){
            if(arr[i] != largest){
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        return secondLargest;
        */
        int largest = -1;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            //If current element is greater than
            //first then update both first and second
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            //If arr[i] is in between first and
            //  second then update second
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
