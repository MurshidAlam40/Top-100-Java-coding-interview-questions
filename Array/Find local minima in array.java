//using binary search to find local minima
import java.util.Scanner;
import java.io.*;

class localMinima{
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = ob.nextInt();
        }
        
        System.out.println(findLocalMinima(arr, 0, n-1, n));
    }
    
    // A binary search based function that returns
    // index of a local minima.
    public static int findLocalMinima(int[] arr, int start, int end, int n){
        
        // Find index of middle element
        int mid = start + (end - start) / 2;
         
         // Compare middle element with its neighbours
        // (if neighbours exist)
        if((mid == 0 || arr[mid-1] > arr[mid]) && (mid == n-1 || arr[mid+1] > arr[mid]))
                return mid; // these print index of localMinima
                //return arr[mid]; //print element of llocalMinima
         
        // check if left neighbor is less than mid element, if yes go left
        else if(mid > 0 && arr[mid] > arr[mid-1])
                return findLocalMinima(arr, start, mid - 1, n);
         
        // check if right neighbor is greater than mid element, if yes go right
        return findLocalMinima(arr, mid + 1, end, n);
    }
}
