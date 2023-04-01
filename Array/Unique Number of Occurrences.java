import java.util.*;
import java.io.*;

class CheckUniqueNumber{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        boolean ans = obj.uniqueOccurrences(arr);
        
        if(ans == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
 
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
    
        for(int val : arr){
            if(!map.containsKey(val)){
                map.put(val, 1);
            }
            else{
                map.put(val, map.get(val) + 1);
            }
        }
    
        HashSet<Integer> key = new HashSet<>();
    
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(key.contains(entry.getValue()))
                return false;
            else
                key.add(entry.getValue());
        }
        return true;
    }
}
