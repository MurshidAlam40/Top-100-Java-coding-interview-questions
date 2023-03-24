import java.io.*;
import java.util.*;
public class findPairClosestToZero{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<n; ++i){
            arr[i] = sc.nextInt();
        }
        closestToZero(arr, n);
    }
   
 
    public static void closestToZero(int arr[], int n) {
 
        //Sort the elements 
        Arrays.sort(arr);
          if(n<0)
            return;
            
        int sum=0; 
        int minSum = Integer.MAX_VALUE;
        
        int start = 0;
        int end = n-1;
 
        // variables to keep track of the left and right index pair for minSum
        int minLeft = start, minRight = end;
 
        while(start < end){
            sum = arr[start] + arr[end];
 
            //Absolute distance from 0 is diffent from all pair find minimum sum
            if(Math.abs(sum) <= Math.abs(minSum)){
                minSum = sum;
                minLeft = start;
                minRight = end;
            }
            // if sum is less than 0    
            if(sum < 0)
                start++;
            //if sum is greater than 0
            else
                end--;
        }
 
        System.out.print("Pair = "+arr[minLeft]+" and "+ arr[minRight]);
        System.out.println();
        System.out.print("minSum = "+minSum);
    }
}
