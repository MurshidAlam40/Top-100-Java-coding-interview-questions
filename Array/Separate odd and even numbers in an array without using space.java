//Given an array Arr[], write a program that segregates even and odd numbers.
//The program should put all even numbers first in nonsorted order, and then odd numbers in nonsorted order.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        new Solution().segregateEvenOdd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        int left = 0;
        int right = n-1;
        
        while(left < right){
            
            while(arr[left]%2 == 0){
                left++;
            }
            
            while(arr[right]%2 == 1){
                right--;
            }
            
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
