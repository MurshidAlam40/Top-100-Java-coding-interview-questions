import java.io.*;
import java.util.*;

class autoMobile{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
    
        int v = sc.nextInt();
        int w = sc.nextInt();
        
        possibleVehicle(v, w);
    }
    
    static void possibleVehicle(int v, int w){
            
        int res = (4*v - w)/2;
        
        if(w >= 2 && w%2 == 0 && v < w){
            System.out.println("Tw "+res+" Fw "+ (v - res));
        }
        else
            System.out.println("INVALID INPUT");
    }
}
