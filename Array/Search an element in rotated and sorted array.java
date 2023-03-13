
import java.util.*;
import java.io.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int A[] = new int[n];
        for(int i = 0; i<n; ++i){
            A[i] = sc.nextInt();
        }
    
        int key = sc.nextInt();
        System.out.println(new Solution().search(A, 0, n - 1, key));
      
    }
}



class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        /*
        l = 0;
        h = A.length;
        for(int i=l; i<h; i++){
            if(A[i] == key)
                return i;
        }
        return -1;
        */
        /*
        l = 0;
        h = A.length-1;
        while(l<h){
            if(A[l] == key)
                return l;
            if(A[h] == key)
                return h;
            l++;
            h--;
        }
        return -1;
        */
        int mid;
        while(l <= h){
            //Compute mid i.e low+high/2.
            mid = l + ((h - l) / 2);
            //Check if a[mid…high] is sorted
            if(A[mid] == key){
                return mid;
            }
            if(A[mid] <= A[h]){
                // Right part is sorted
                //If number lies between the range , low=mid+1.
                if(key > A[mid] && key <= A[h]){
                    l = mid+1;
                }
                //If number does not lie in the range, high=mid-1.
                else{
                    h = mid-1;
                }
            }
            //Check if a[low..mid] is sorted
            else{
                // Left part is sorted
                if(A[l] <= key && key < A[mid]){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
