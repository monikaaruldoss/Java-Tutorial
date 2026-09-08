import java.io.*;
public class CharExample {
    public static void main(String [] t) throws IOException{
        BufferedReader ar = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the String : ");
        String word = ar.readLine();
        char c[] = word.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        } 
    }
}
