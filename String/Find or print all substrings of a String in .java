import java.io.*;
import java.util.*;

public class SubstringsOfString{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Solution ob = new Solution();
        ob.SubString(str, str.length());
    }
}
//1st Method
/*
class Solution{
    static void SubString(String str, int n){
        // Pick starting point
        for(int i=0; i<n; i++){
            // Pick ending point
            for(int j=i+1; j<=n; j++){
                //The substring begins 
                //with the character at the specified index 
                //and extends to the end of this string
                //substring(begIndex, endIndex)
                System.out.println(str.substring(i, j));
            }
        }
    }
}
*/
// 2ndMethod
/*
class Solution{
    static void SubString(String str, int n){
        // this loop is for the selection
        // of starting point
        for(int i=0; i<n; i++){
            //this loop is for selection
            // of ending point
            for(int j=i; j<n; j++){
                //This loop is for printing from
                // starting point to ending point
                for(int k=i; k<=j; k++){
                    System.out.print(str.charAt(k));
                }
                // changing the line after printing
                // from starting point to ending point
                System.out.println();
            }
        }
    }
}
*/
//3rd Method

class Solution{
    public void SubString(String str, int n){
        // First loop for starting index
        for(int i=0; i<n; i++){
            String subStr = "";
            // Second loop is generating sub-String
            for(int j=i; j<n; j++){
                subStr += str.charAt(j);
                
                System.out.println(subStr+" ");
            }
        }
    }
}
