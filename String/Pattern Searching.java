import java.io.*;
import java.util.*;

public class ConvertStringToInteger{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.next();
        String pattern = sc.next();
        Solution ob = new Solution();
        System.out.println(ob.search(text,pattern));
    }
}


class Solution {
    int search(String text, String pat) {
        // code here
        /*
        int exits = text.lastIndexOf(pat);
        
        if(exits == -1)
            return 0;
        return 1;
        */
        
        if(text.contains(pat))
            return 1;
        
        return 0;
    }
};
