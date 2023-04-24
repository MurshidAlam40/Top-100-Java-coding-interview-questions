import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
    
        // taking total count of elements
        int n = sc.nextInt();

        // creating a new array of size n
        int arr[] = new int[n];

        // inserting elements to the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        // calling firstRepeated method
        // and printing the result
        System.out.println(ob.firstRepeated(arr, n));
    }
}


class Solution{
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        /*
        for(int i=1; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] <= arr[j]){
                    return i;
                }
                break;
            }
        }
        return -1;
        */
        //
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0; i<n; i++){
            if(map.get(arr[i]) > 1)
                return i + 1;
        }
        return -1;
    }
}
