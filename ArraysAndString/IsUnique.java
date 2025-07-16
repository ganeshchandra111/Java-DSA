// Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
// cannot use additional data structures?

class IsUnique{

    public static  boolean isUniqueString(String s){
        if(s.length() > 128) return false; // Assuming ASCII characters
        boolean[] charSet = new boolean[128]; // Array to track characters

        for(int i =0; i<s.length();i++){
            int val = s.charAt(i);

            if(charSet[val]){
                return false;
            }
            charSet[val] = true; // Mark character as seen
        }
        return true;
    }
    public static void main(String[] args) {
        // This was my code,which has time complexity of O(n2);
        // String UserGivenString = "Ganesh Chandra";
        // for(int i =0; i<UserGivenString.length(); i++){
        //     for(int j = i+1; j<UserGivenString.length(); j++){
        //         if(UserGivenString.charAt(i) == UserGivenString.charAt(j)){
        //             System.out.println("The string does not have all unique characters.");
        //             return;
        //         }
        //     }
        // }
        // System.out.println("The string has all unique characters.");

        // CTCL SOl
        System.out.println("Is Unique String: " + isUniqueString("Ganesh"));

    }
}


