import java.util.HashMap;
import java.util.Map;

public class OneAway {
    static boolean isOneAway(String s1, String s2){
        // if(s1.length() - s2.length() != 1){
        //     return false;
        // }

        HashMap<Character, Integer> hm = new HashMap();

        for(int i =0; i<s1.length();i++){
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(hm, 1)+1);
        }

        for(int i =0; i<s2.length();i++){
            char ch = s2.charAt(i);
            hm.put(ch, hm.getOrDefault(hm, 1)+1);
        }

        int oddCount=0;
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()%2!=0){
                oddCount++;
            }
            if(oddCount>1){
                return false;
            }
        }

        return true;
        

    }
    public static void main(String[] args) {
    
        System.out.println(isOneAway("abc","xyz"));
    }
}















