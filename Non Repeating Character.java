package String;
import java.io.*;
import java.util.Scanner;

public class nonRepeatingCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        Solutionnon obj = new Solutionnon();
        char ans = obj.non_Repeating_Character(st);
        if(ans != '$')
            System.out.println(ans);
        else
            System.out.println(-1);
    }
}

class Solutionnon{
    //Function to find the first non-repeating character in a string.
    static char non_Repeating_Character(String S){
        //Your code here
        for(int i=0; i<S.length(); i++){
            //search for the current character in the string 
            //just after its first occurrence in the string
            if(S.indexOf(S.charAt(i), S.indexOf(S.charAt(i)) + 1) == -1)
                return S.charAt(i);
        }
        return '$';
               
        //getCharCountArray(S);
        /* The method returns index of first non-repeating
       character in a string. If all characters are
       repeating then returns -1 */
       /*
        for(int i=0; i<S.length(); i++){
            if(count[S.charAt(i)] == 1)
                return S.charAt(i);
        }
        return '$';
        */
    }
    /* 
    static char count[] = new char[256];
     //calculate count of characters in the passed string 
    static void getCharCountArray(String S){
        for (int i=0; i<S.length(); i++)
            count[S.charAt(i)]++;
    }
    */
}
