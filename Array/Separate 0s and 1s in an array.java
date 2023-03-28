import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        new Solution().segregate0and1(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        /*
        Arrays.sort(arr);
        */
       
        int count = 0;
        // counts the no of zeros in arr
        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                count++;
        }
        // loop fills the arr with 0 until count
        for(int i=0; i<count; i++){
            arr[i] = 0;
        }
         // loop fills remaining arr space with 1
        for(int i=count; i<n; i++){
            arr[i] = 1;
        }
    }

}
