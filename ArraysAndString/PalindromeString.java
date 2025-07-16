// Check String palidrome


public class PalindromeString {

    public static boolean isPalindrome(String s){
        int j=s.length()-1;
        boolean isPalindrome = true;
        for(int i =0; (i<s.length()/2); i++){
            if(j<i || j==i){
                return isPalindrome;
            }

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println("Is Palindrom ? " + isPalindrome(s));
    }
}