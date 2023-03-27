//Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. 
//The task is to cyclically rotate the array clockwise by K.

//Note : Keep the first of the array unaltered.

import java.util.*;

class cyclicRotate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = rotate(arr, n, k);

        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }

    static int[] rotate(int arr[], int n, int k){

        int ans[] = new int[n];

        for(int i=0; i<k; i++){
            ans[i] = arr[n-k+i];
        }

        for(int i=k; i<n; i++){
            ans[i] = arr[i-k];
        }
        return ans;
    }
}
