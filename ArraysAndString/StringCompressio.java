
public class StringCompressio {
    // static String CompressString(String s){
    // String str = "";

    // HashMap<Character,Integer> hm = new HashMap<>();
    // for(int i =0; i<s.length()-1;i++){
    // if(s.charAt(i)!=s.charAt(i+1)){
    // Integer count = hm.get(s.charAt(i));
    // String countLabel = String.valueOf(s.charAt(i));
    // str = str+count.toString() + countLabel;
    // hm.clear();
    // }else{
    // hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 1)+1);
    // }
    // }

    // return str;
    // }

    static StringBuilder CompressStringOptimized(String s) {
        StringBuilder compressedString = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;

            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedString.append(count);
                compressedString.append(s.charAt(i));
                count = 0;
            }
        }
        return compressedString;
    }

    public static void main(String[] args) {
        String s = "aaabbbccsssaaaddffff";
        // System.out.println(CompressString(s));
        System.out.print(CompressStringOptimized(s));

    }
}
