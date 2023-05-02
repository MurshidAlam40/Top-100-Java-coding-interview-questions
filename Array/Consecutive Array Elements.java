import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        //input a number n
        int n = sc.nextInt();
        
        
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution ob = new Solution();
        boolean ans=ob.areConsecutives(arr, n);
       
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}

class Solution{
    boolean areConsecutives(int arr[], int n){
        //If given array elements are consecutive that means they are in AP
        int firstTerm = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            if(arr[i] < firstTerm)
                firstTerm = arr[i];
        }
        
        int apSum = (n*(2*firstTerm+(n-1)*1))/2;
        
        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum += arr[i];
        }
        
        if(apSum == arrSum){
            return true;
        }
        return false;
    }
}
