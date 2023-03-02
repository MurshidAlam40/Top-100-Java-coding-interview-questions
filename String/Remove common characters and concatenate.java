import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
    
        String s1=in.next(),
               s2=in.next();
        
        Solution obj = new Solution();
        
        System.out.println(obj.concatenatedString(s1,s2));
    }
}


class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String ans = "";
         // creating a hashMap 
        HashMap<Character, Integer> map = new HashMap<>();
        //add characters of string s2 in HashMap
        for(int i=0; i<s2.length(); i++){
            map.put(s2.charAt(i), 1);
        }
         // Find characters of s1 that are not
        // present in s2 and append to result
        for(int i=0; i<s1.length(); i++){
            if(!map.containsKey(s1.charAt(i)))
                ans = ans + s1.charAt(i);
            else
                map.put(s1.charAt(i), 2);
        }
        // Find characters of s2 that are not
        // present in s1.
        for(int i=0; i<s2.length(); i++){
            if(map.get(s2.charAt(i)) == 1)
                ans = ans + s2.charAt(i);
        }
        
        if(ans == "")
            return "-1";
            
        return ans;
    }
}
