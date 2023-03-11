import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	 
	    Solution ob=new Solution();
	    
	    String S=sc.nextLine();
	    
	    ArrayList<String> arr = ob.permutation(S);
	    for(String s : arr){
	        System.out.print(s+" ");
	    }
	    System.out.println();
		
	}
}


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        
        ArrayList<String> list = new ArrayList<>();
        
        Permutations(S, "", list);
        Collections.sort(list);
        
        return list;
    }
    
    static void Permutations(String str, String ans, ArrayList<String> list){
        
        int n = str.length();
        if(n == 0){
            list.add(ans);
            return;
        }
        
        for(int i=0; i<n; i++){
            
            char ch = str.charAt(i);
            
            String ros = str.substring(0, i) + str.substring(i+1);
            
            Permutations(ros, ans + ch, list);
        }
    }
}
