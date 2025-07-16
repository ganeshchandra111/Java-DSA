/*
 * 
Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith
Output: "Mr%203ohn%20Smith"
 * 
 * 
 */

public class URLify {
    static String url(String s) {
        char[] ch = s.toCharArray();
        s="";
        for(int i = 0; i<ch.length;i++){
            if(ch[i] == ' '){
                s+="%20";
            }else{
                s+=ch[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String userString = "Mr John Smith";
        System.out.println(url(userString));
    }
}


