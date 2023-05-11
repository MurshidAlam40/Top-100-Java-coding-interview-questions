import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Solution obj = new Solution();
        System.out.println(obj.longestPalindrome(s));
    } 
} 
   
class Solution {
    public int longestPalindrome(String s) {
        int len = 0;
        HashSet<Character> map = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.contains(ch)){
                len += 2;
                map.remove(ch);
            }
            else{
                map.add(ch);
            }
        }
        if (map.size() > 0) {
            len ++;
        }
        return len;        
    }
}
