import java.util.*;
import java.io.*;

class FreqOfEachElems{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = findFrequency(arr, n);
 
        for(int ele : map.keySet()){
            System.out.println("Frequency of "+ ele+" is "+map.get(ele));
        }
    }
 
    public static HashMap<Integer, Integer> findFrequency(int arr[], int n){
        // Code here
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        int freq = 1;
        
        for(int i=1; i<n; i++){
            
            if(arr[i] == arr[i-1]){
                freq++;
            }
            else{
                map.put(arr[i-1], freq);
                freq = 1;
            }
        }
        map.put(arr[n-1], freq);
        
        return map;
        */
        //using HashMap
        /*
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : arr){
            if(!map.containsKey(val)){
                map.put(val, 1);
            }
            
            else{
                map.put(val, map.get(val)+1);
            }
        }
        return map;
        */
        // use normal for loop
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        return map;
        
    }
}
