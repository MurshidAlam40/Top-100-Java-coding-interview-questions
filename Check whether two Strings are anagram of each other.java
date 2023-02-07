import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        Solution obj = new Solution();

        if(obj.isAnagram(s1, s2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
class Solution{
    public static boolean isAnagram(String a, String b){
        /*
        // Get lengths of both strings
        int n1 = a.length();
        int n2 = b.length();
        // If length of both strings is not same, then they cannot be anagram
        if(n1 != n2)
            return false;
        // convert the String to Arrays
        char temp_a[] = a.toCharArray();
        char temp_b[] = b.toCharArray();
        // Sort the both arrays
        Arrays.sort(temp_a);
        Arrays.sort(temp_b);
        // Compare sorted strings
        for(int i=0; i<n1; i++){
            if(temp_a[i] != temp_b[i])
                return false;
        }
        return true;
        */
        // Secound method
        /*
        the characters are stored using 8 bit and there
        can be 256 possible characters.
        Create count arrays of size 256 for both strings
        initialize all values as 0
        */
        int count[] = new int[256];
        // Get lengths of both strings
        int n1 = a.length();
        int n2 = b.length();
        // If length of both strings is not same, then they cannot be anagram
        if(n1 != n2)
            return false;
        // convert the String to Arrays
        char temp_a[] = a.toCharArray();
        char temp_b[] = b.toCharArray();
        // For each character in input strings,increment count in the corresponding
        // count array
        for(int i=0; i<n1; i++){
            count[temp_a[i]]++;
            count[temp_b[i]]--;
        }
        // See if there is any non-zero value in count array
        for(int i=0; i<256; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}
