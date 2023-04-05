import java.io.*;
import java.util.*;

class parkingSpaces{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
    
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        maximumNumberOf1(arr, r, c);
    }
    
    static void maximumNumberOf1(int arr[][], int r, int c){
        
        int count = 0;
        int max = 0;
        int index = 0;
        
        for(int i=0; i<r; i++){
            
            for(int j=0; j<c; j++){
                if(arr[i][j] == 1)
                    count++;
            }
            
            if(count > max){
                max = count;
                index = i+1;
            }
        }
        
        System.out.println(index);
    }
}
