import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ;i < n; i++)
			a[i]=sc.nextInt();
		Solution g = new Solution();
		System.out.println(g.palinArray(a , n));
	}
}

class Solution
{
	public static int palinArray(int[] a, int n){
        //add code here.
        int flag = 1;
        
        for(int i=0; i<n; i++){
            int temp = a[i];
            int rev = 0;
            while(temp != 0){
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }
            if(a[i] != rev){
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
