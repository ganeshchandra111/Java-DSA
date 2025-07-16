/*
 
Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards, A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: T a c t Coa
Output: T r u e (permutations: " t a c o c a t " " a t c o e t a " etc.)

 */

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutaion {
    static boolean isPermuationPalindrome(String a) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int oddCount = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            // System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() % 2 == 0) {
            } else {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "hello";
        System.out.println(isPermuationPalindrome(a));
    }

}