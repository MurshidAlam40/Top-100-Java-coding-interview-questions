import java.util.*;
import java.math.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Solution ob = new Solution();

        System.out.println(ob.NthTerm(N));
    }
}    


class Solution {
    static BigInteger NthTerm(int N){
        // code here
        BigInteger num = new BigInteger("2");
        
        if(N == 1 || N == 2)
            return num;
            
        if(N%2 != 0){
            for(int i=3; i<=N; i=i+2){
                num = num.multiply(num);
            }
        }
        else if(N%2 == 0){
            for(int i=4; i<=N; i=i+2){
                num = num.pow(3);
            }
        }
        return num;
    }
}
