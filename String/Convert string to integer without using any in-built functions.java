import java.io.*;
import java.util.*;

public class ConvertStringToInteger{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution ob = new Solution();
        ob.convert(s);
    }
}


class Solution{

    // Function to convert string to
    // integer without using functions
    public static void convert(String s){
    	
    	// Initialize a variable
    	int num = 0;
    	int n = s.length();
    
    	// Iterate till length of the string
    	for(int i = 0; i < n; i++){
    
    		// Subtract 48 from the current digit
    		// Ascii value of num start from 49
    	    num = num * 10 + ((int)s.charAt(i) - 48);
    		
    	}
    	// Print the answer
    	System.out.print(num);
    }

}
