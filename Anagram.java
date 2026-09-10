import java.io.*;
public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First String :");
        String s = br.readLine();
        System.out.println("Enter Second String :");
        String t = br.readLine();
        System.out.println("The given strings are anagrams : " + AnagramMethod(s, t));
    }
    public static boolean AnagramMethod(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for(int i = 0;i<s.length();i++){
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--;
        }
        for(int Count : charCount){
            if( Count != 0){
                return false;
            }
        }
        return true;
    }
}
