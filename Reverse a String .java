import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        Scanner read = new Scanner(System.in);
        String str = read.readLine();
        System.out.println(new Reverse().reverseWord(str));
    }
}


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n = str.length();
        String reverse = "";
        for(int i=n-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
        /*
        //Alternative approach
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return s.toString();
        */
    }
}
