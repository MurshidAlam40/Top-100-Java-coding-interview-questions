import java.util.*;
 
class RLEncoding{
   public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
		  
	String S = sc.nextLine();

    Solution ob = new Solution();
    System.out.println(ob.findMaxLen(S));
   }
}


class Solution {
    static int findMaxLen(String S) {
        // code here
        
        int n = S.length();
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<n; i++){
            if(S.charAt(i) == '('){
                st.push(i);
            }
            else{
                if(!st.empty()){
                    st.pop();
                }
                if(!st.empty()){
                    ans = Math.max(ans, i - st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return ans;
    }
};
