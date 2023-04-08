//{ Driver Code Starts
import java.util.*;
import java.io.*;
class PeakElement{
	public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a = new int[n];
		    int[] tmp = new int[n];
		    
			for(int i=0; i<n; i++){
				a[i] = sc.nextInt();
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    System.out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    System.out.println(f);
			}
	}
}


class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       /*
       //Brute force
        
        if(n ===1 || arr[0] >= arr[1])
            return 0;
        
        if(arr[n-1] >= arr[n-2])
            return n-1;
            
        //Check for every Element 
        for(int i=1; i<n-1; i++){
            //Check if the neighbours are smaller
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return i;
        }
        return 0;
        */
        
        //Find a peak element using Binary search
        
        int start = 0;
        int end = n-1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            //Check if the arr[mid] > arr[mid+1] ,
            //if yes then check for peak element on the left side and set end = mid.
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            //Check if the arr[mid] < arr[mid+1] ,
            //if yes then check for peak element on the right side and set start = mid+1.
            else{
                start = mid + 1;
            }
        }
        
        return start;
    }
}
