


public class StringRotation {
    static boolean stringRotation (String s1, String s2){

        int len = s1.length();
        if(len == s2.length() && len>0){
            String s1s1 = s1+s1;
            return isSubstring(s1s1,s2);
        }

        return false;
    }
    private static boolean isSubstring(String s1s1, String s2) {
        return s1s1.contains(s2);
    }

    //s1s1 = waterbottlewaterbottle
    public static void main(String[] args) {
        System.out.println(stringRotation("waterbottle", "rbottlewate"));
    }
}








