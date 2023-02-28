import java.io.*; 
import java.util.*; 

public class StringFindDuplicatesMain{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        countDuplicateCharacters(str);
        
    }
    
    public static void countDuplicateCharacters(String str){
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        char charArray[] = str.toCharArray();
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }
            else{
                hm.put(c, 1);
            }
        }
        /*
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() > 1)
             System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
        */
        for (Character c : hm.keySet()) {
            if (hm.get(c) > 1)
                System.out.println(c+ " : "+ hm.get(c));
        }
    }
}
