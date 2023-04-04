import java.util.*;

public class MaxSumPath{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        ArrayList<Integer> res = obj.subarraySum(arr, n, k);
        for(int i = 0; i<res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
    }
}

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList<Integer> ans = new ArrayList<Integer>();
       int start = 0, i = 1;
       int currSum = arr[0];
       
       if(arr[0] == s){
           ans.add(1);
           ans.add(1);
           return(ans);
       }
       while(i < n){
           if(s == 0){
               if(arr[i] == 0){
                   ans.add(i+1);
                   ans.add(i+1);
                   break;
               }
               else{
                   i++;
               }
           }
           else if(currSum + arr[i] <= s){
               currSum += arr[i];
               i++;
           }
           else{
               currSum = currSum - arr[start];
               start++;
           }
           
           if(currSum == s){
               ans.add(start + 1);
               ans.add(i);
               break;
           }
       }
       if(ans.size() == 0){
           ans.add(-1);
       }
       return(ans);
    }
}
