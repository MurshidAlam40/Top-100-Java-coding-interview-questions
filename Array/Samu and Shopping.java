import java.io.*; 
import java.util.*; 

class TestClass{
    
   final static int SHIRT = 0; 
   final static int PANT = 1; 
   final static int SHOE = 2;
   
   public static void main(String args[] ) throws Exception { 
       Scanner s = new Scanner(System.in); 
      
       int n = s.nextInt(); 
       int arr[][] = new int[n][3];
       
       for(int i=0; i<n; i++){ 
           arr[i][SHIRT] = s.nextInt(); 
           arr[i][PANT] = s.nextInt(); 
           arr[i][SHOE] = s.nextInt(); 
       } 
        System.out.println(getMinPrice(arr, n));
   }
   
   
   public static int getMinPrice(int[][]arr, int n){
       for(int i=1;i<n;i++) {
           arr[i][SHIRT] += Math.min(arr[i-1][PANT], arr[i-1][SHOE]);
           
           arr[i][PANT] += Math.min(arr[i-1][SHIRT], arr[i-1][SHOE]);
           
           arr[i][SHOE] += Math.min(arr[i-1][SHIRT], arr[i-1][PANT]);
       }
       return Math.min(arr[n-1][SHIRT], Math.min(arr[n-1][PANT], arr[n-1][SHOE])); 
   } 
    
} 
