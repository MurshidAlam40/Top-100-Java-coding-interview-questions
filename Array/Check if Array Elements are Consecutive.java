import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        //input a number n
        long n = sc.nextLong();
        
        
        long a[] = new long[(int)n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Solution ob = new Solution();
        boolean ans=ob.areConsecutives(a,(int)n);
       
        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

class Solution
{
    boolean areConsecutives(long arr[], int N)
    {
        /*
        //Brute force
        //Sort the array
        Arrays.sort(arr);
        // checking the adjacent elements
        for(int i=1; i<N; i++){
            if(arr[i] != arr[i-1] + 1)
                return false;
        }
        return true;
        */
        //Optimal Solution
        if (N < 1)
            return false;
            
        long min = getMin(arr, N);
        long max = getMax(arr, N);
        if (max - min + 1 == N){
            boolean visited[] = new boolean[N];
            
            for(int i=0; i<N; i++){
                if(visited[(int)(arr[i] - min)] != false)
                    return false;
               
                visited[(int)(arr[i] - min)] = true;
            }
            return true;
        }
        return false;
    }
    
    long getMin(long arr[], int N){
        long min = arr[0];
        for (int i=0; i<N; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
 
    long getMax(long arr[], int N){
        long max = arr[0];
        for (int i=0; i<N; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
