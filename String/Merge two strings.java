import java.io.*;
import java.util.*; 
class Main{
    public static void main(String args[]) throws IOException{ 
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.merge(S1,S2));
    }
}

class Solution{ 
    String merge(String S1, String S2){ 
        // code here
        // Store the final string
        StringBuilder ans = new StringBuilder();
  
        // For every index in the strings
        for(int i=0; i<S1.length() || i<S2.length(); i++){
  
            // First choose the ith character of the first string
            if(i < S1.length())
                ans.append(S1.charAt(i));
  
            // Then choose the ith character of the second string if it exists
            if(i < S2.length())
                ans.append(S2.charAt(i));
        }
  
        return ans.toString();
    }
}
