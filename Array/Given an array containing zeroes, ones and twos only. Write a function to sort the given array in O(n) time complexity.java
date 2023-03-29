import java.io.*;
import java.util.*; 
class Main{
    public static void main(String args[]) throws IOException { 
        Scanner read = new Scanner(System.in);
        
        int n = read.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = read.nextInt();
        }
        Solution ob=new Solution();
        ob.sort012(arr, n);
        StringBuffer str = new StringBuffer();
        for(int i=0; i<n; i++){
            str.append(arr[i]+" ");
        }
        System.out.println(str);
    } 
} 

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        /*
        Arrays.sort(a);
        */
        
        int start = 0;
        int mid = 0;
        int end = n-1;
        
        while(mid <= end){
            //when element at mid pointer is 1
            if(a[mid] == 1)
                mid++;
            //when element at mid pointer is zero 
            //swap the element with start pointer
            else if(a[mid] == 0){
                int temp = a[start];
                a[start] = a[mid];
                a[mid] = temp;
                mid++;
                start++;
            }
            //when element at mid pointer is two
            //swap the element with end pointer
            else{
                int temp = a[end];
                a[end] = a[mid];
                a[mid] = temp;
                end--;
            }
       }    
    }
}
