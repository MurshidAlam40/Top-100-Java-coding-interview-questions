import java.io.*;
import java.util.*;

public class LenghtOfString{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution ob = new Solution();
        System.out.println("length of string : "+ob.getLengthOfStringWithCharArray(str));
    }
}

class Solution {
    public static int getLengthOfStringWithCharArray(String str) {
        // code here
      
        int length = 0;
        char charArray[] = str.toCharArray();
        
        for(int ch : charArray){
            length++;
        }
        return length;
        
        // Secound Method
        /*
        int length = 0;
        
        for(int i=0; i<str.length(); i++){
            length++;
        }
        return length;
        */
    }
}
