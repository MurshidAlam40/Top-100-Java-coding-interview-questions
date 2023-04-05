import java.io.*;
import java.util.*;

class minimumNumberOf1{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        Solution ob = new Solution();
        System.out.println(ob.minRow(N, M, A));
    }
}
class Solution {
    int minRow(int N, int M, int A[][]) {
        // code here
        int min = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i=0; i<N; i++){
            int count = 0;
            for(int j=0; j<M; j++){
                if(A[i][j] == 1)
                    count++;
            }
            
            if(count < min){
                min = count;
                index = i+1;
            }
        }
        return index;
    }
}
