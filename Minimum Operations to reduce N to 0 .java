import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.minOperation(n));
        }
}    


class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int count = 0;
        while(n > 0){
            // if n is even then it will be good to
            // reach n from n/2 by multiplying it by 2.
            if(n%2 == 0){
                n = n/2;
            }
            // if n is odd then we can reach n from n-1 only. 
            else{
                n = n - 1;
            }
            count++;     
        }
        return count;
    }
}
