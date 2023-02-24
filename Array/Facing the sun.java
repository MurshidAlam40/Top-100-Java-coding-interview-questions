import java.util.*;
 
class RLEncoding{
   public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
		  
	int n = sc.nextInt();
    int[] h = new int[n];
  
    for (int i = 0; i < n; i++) {
        h[i] = sc.nextInt();
    }


    int ans = new Solution().countBuildings(h, n);
    System.out.println(ans);
   }
}


class Solution {
    int countBuildings(int h[], int n) {
        // code here
        
        int count = 1;
        int currMax = h[0];
        for(int i=1; i<n; i++){
            if(h[i] > currMax){
                count++;
                currMax = h[i];
            }
        }
        return count;
    }
}
