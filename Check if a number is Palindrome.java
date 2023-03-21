import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution obj = new Solution();
        if (obj.isPalindrome(x) == true) {
          System.out.println("Yes");
        }
        else {
          System.out.println("No");
        }
    }
}


class Solution {
    public boolean isPalindrome(int x) {
        /*
        int reverse = 0;
        int temp = x;

        while(temp > 0){
            reverse = (reverse * 10) + (temp%10);
            temp = temp / 10;
        }

        if(x == reverse){
            return true;
        }
        return false;
        */

        String s = String.valueOf(x);
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) != s.charAt(n-i - 1))
                return false;
        }
        return true;
    }
}
