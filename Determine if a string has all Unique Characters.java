import java.util.*;
public class uniqueCharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        if(obj.hasAllUniqueChars(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

class Solution {
    static boolean hasAllUniqueChars(String str){
        /* 
        // If at any time we encounter 2 same characters, return false
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        // If no duplicate characters encountered,return true
        return true;
        */

        // Second method
        
        //Convert the string to character array
        char chArray[] = str.toCharArray();
        //Using sorting sort the array
        Arrays.sort(chArray);

        for(int i=0; i<chArray.length-1; i++){
            // if the adjacent elements are not equal, move to next element
            if(chArray[i] != chArray[i+1])
                continue;
            else // if at any time, 2 adjacent elements become equal, return false
                return false;
        }
        return true;
    }
}
