import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner br = new Scanner(System.in);
      
        
        int n = br.nextInt();
        int x = br.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = br.nextInt();
        }
        Solution ob = new Solution();
        int ans[] = ob.sumClosest(arr, x);
        System.out.print(ans[0]+" "+ans[1]);
        System.out.println();
    }
}


class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here
        int n = arr.length;
        int pair[] = new int[2];
        
        if(n < 2){
            pair[0] = arr[0];
            pair[1] = arr[0];
            
            return pair;
        }
        
        int start = 0;
        int end = n-1;
        int minSum = Integer.MAX_VALUE;
        
        while(start < end){
            int sum = arr[start] + arr[end];
            
            int diff = Math.abs(x - sum);
            if (diff < minSum) {
                minSum = diff;
                pair[0] = arr[start];
                pair[1] = arr[end];
            }
            if(sum < x)
                start++;
            else
                end--;
        }
        return pair;
    }
}
