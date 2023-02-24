import java.util.*;
 
class RLEncoding{
   public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
		  
	String str = sc.nextLine();

    String ans = new Solution().removeDuplicates(str);
    System.out.println(ans);
   }
}


class Solution {
    String removeDuplicates(String str) {
        // code here
        HashSet<Character> hs = new LinkedHashSet<>();
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(hs.add(str.charAt(i))){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}

