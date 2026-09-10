import java.io.*;
public class Palindrome {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                System.out.println("No");
                return;
            }
            i++;
            j--;
        }
        System.out.println("yes");
    }
}
