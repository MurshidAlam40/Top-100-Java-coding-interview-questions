
import java.util.*;
import java.lang.*;
import java.io.*;

class pair{  
    long first, second;  
    public pair(long first, long second){  
        this.first = first;  
        this.second = second;  
    }  
}

class Main {
	public static void main(String[] args) throws IOException{
	        Scanner sc = new Scanner(System.in);
        
            long n = sc.nextLong();
            long a[] = new long[(int)(n)];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
	}
}


class Compute{
    static pair getMinMax(long a[], long n){
        //Write your code here
        long min = a[0];
        long max = a[0];
        
        for(int i=0; i<n; i++){
           if(a[i] < min){
               min = a[i];
           }
           else if(a[i] > max){
               max = a[i];
           }
       }
        pair minmax = new pair(min, max);
        return minmax;
    }
}
