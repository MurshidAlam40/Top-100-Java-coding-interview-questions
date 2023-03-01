import java.io.*;
import java.lang.*;
import java.util.*;

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
        /*
        // Convert string to char Array
        char array[] = S.toCharArray();
        //Iterate through each character of string
        for(int i=0; i<array.length; i++){
            //If lastIndexOf and indexOf return same value,
            //then it is first non repeating character in the String.
            if(S.indexOf(array[i]) == S.lastIndexOf(array[i]))
                return array[i];
        }
        return '0';
        */
        
        for(int i=0; i<S.length(); i++){
            if(S.indexOf(S.charAt(i), S.indexOf(S.charAt(i)) + 1) == -1){
                return S.charAt(i);
            }
        }
        return '0';
    }
}
