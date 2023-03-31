import java.util.*;
import java.io.*;
 
public class SlidingWindowMax{
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
 
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> res = maxSlidingWindow(arr, n, k);
        //printing the elements of the ArrayList
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
 
    public static ArrayList <Integer> maxSlidingWindow(int[] arr, int n, int k) {
        /*
        //Brute force
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n-k+1; i++){
            int max = arr[i];
            for(int j=1; j<k; j++){
                if(arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            ans.add(max);
        }
        return ans;
        */
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        Deque<Integer> dq = new LinkedList<>();
        
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
        }
        
        for(int i=k; i<n; i++){
            ans.add(arr[dq.peek()]);
            
            while(!dq.isEmpty() && dq.peek() <= i-k){
                dq.removeFirst();
            }
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
        }
        
        ans.add(arr[dq.peek()]);
        
        return ans;
    }
}
