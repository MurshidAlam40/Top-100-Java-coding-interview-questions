import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    String S=sc.nextLine();
	    
	    Solution ob = new Solution();
        ArrayList<String> ans = new ArrayList<String>();
        ans = ob.permutation(S);
        
        for(int i=0;i<ans.size();i++){
            System.out.print("("+ans.get(i)+")");
        }
        System.out.println();
		
	}
}


class Solution{
    
    ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String> list = new ArrayList<>();
        
        int n = S.length();
        // Check if length is 1
        if(n == 1){
            list.add(S);
            return list;
        }
        
        ArrayList<String> temp = permutation(S.substring(1, n));
 
        // Iterate over temp
        for(int i=0; i<temp.size(); i++){
 
            list.add(S.charAt(0) + temp.get(i));
            list.add(S.charAt(0) + " " +temp.get(i));
        }
        
        Collections.sort(list);
        // Return list
        return list;
    }
}
