import java.util.*;
public class isRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        SolutionRotations obj = new SolutionRotations();
        if(obj.areRotations(s1, s2))
            System.out.println("1");
        else
            System.out.println("0");

    }
}
class SolutionRotations{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // s1 and s2 are not equal than return false
        if(s1.length() != s2.length())
            return false;
        //find sum of s1
        String str = s1+s1;
        //if s2 contains s1 than return true
        if(str.contains(s2)){
            return true;
        }
        return false;
    }  
}
