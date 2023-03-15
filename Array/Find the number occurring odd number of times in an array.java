import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int ans = new Solution().getOddOccurrence(arr, n);
        System.out.println(ans);
    }
}

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        //brute force
        /*
        int i;
        for(i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count%2 != 0)
                return arr[i];
        }
        return -1;
        */
        /* 
        The Best Solution is to do bitwise XOR of all the map.
        XOR of all map gives us odd occurring map. 

        Here ^ is the XOR operators;
        Note :
        x^0 = x
        x^y=y^x (Commutative property holds)
        (x^y)^z = x^(y^z) (Distributive property holds)
        x^x=0
        */
        //Use XOR operation:
        /*
        int count = 0;
        for(int i=0; i<n; i++){
            count = count ^ arr[i];
        }
        return count;
        */
        //Use Hashing
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(map.get(element) == null){
                map.put(element, 1);
            }
            else
                map.put(element, map.get(element)+1);
        }
    
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 1){
                return entry.getKey();
            }
        } 
        return -1;
    }
}


