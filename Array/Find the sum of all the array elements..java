
import java.util.*;
import java.io.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int array[] = new int[n-1];
        for(int i = 0; i<n-1; ++i){
            array[i] = sc.nextInt();
        }
    
        Solution sln = new Solution();
        System.out.println(sln.MissingNumber(array, n));
      
    }
}



class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sumArr = 0;
        //Find the sum of all the array elements.
        for(int i=0; i<n-1; i++){
            sumArr += array[i];
        }
        //Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2
        int sum = ((n)*(n+1))/2;
        //The missing number as SumTotal – sum of array
        int missingNum = sum - sumArr;
        
        return missingNum;
        
    }
}
