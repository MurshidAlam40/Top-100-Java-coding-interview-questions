import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int prices[] = new int[n];
        
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        Solution x = new Solution();
        System.out.println(x.maxProfit(prices));
    } 
} 
   
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int max_profit = 0;
        for(int i=1; i<n; i++){
        // Checking for lower buy value
            if(buy > prices[i])
                buy = prices[i];
            // Checking for higher profit
            else if(prices[i] - buy > max_profit){
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }
}
