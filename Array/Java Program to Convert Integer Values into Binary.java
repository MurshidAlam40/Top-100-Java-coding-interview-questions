import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        
        decimalToBinary(n);
      
    }
    
    public static void decimalToBinary(int n) {
       /*
         String bin = Integer.toBinaryString(n);
         System.out.println(bin+" ");
        */
        /*
        ArrayList<Integer> ans = new ArrayList<>();
        while(n > 0){
            ans.add(n%2);
            n = n/2;
        }
        Collections.reverse(ans);
        System.out.println(ans+" ");
        */
        
        // Creating Stack Object Vector
        Stack<Integer> st = new Stack<>();
 
       
        while (n > 0) {
            // Pushing numbers inside stack that
            // are divisible by 2
            st.push(n % 2);
            // Dividing number by 2
            n = n / 2;
        }
 
        // Checking condition whether stack is empty
        while (!(st.isEmpty())) {
            System.out.print(st.pop()+" ");
        }
        
    }
}
