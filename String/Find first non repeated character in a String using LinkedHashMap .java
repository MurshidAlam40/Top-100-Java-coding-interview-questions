import java.lang.*;
import java.util.*;
import java.util.Map.Entry;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        
        char ans = new Solution().firstNonRepeatingCharacter(st);
        
        if(ans!='0')
            System.out.println(ans);
        else
            System.out.println(-1);
    }
}


class Solution
{
    //Function to find the first non-repeating character in a string.
    static char firstNonRepeatingCharacter(String S){
        //Your code here
        //
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            
            else{
                map.put(ch, 1);
            }
        }
        // As HashMap maintains insertion order, first character with
        // count 1 should return first non repeated character
        for(Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        
        return '$';
    }
}

