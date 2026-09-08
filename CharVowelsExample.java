import java.io.*;
public class CharVowelsExample {
    public static void main(String [] t) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the String : ");
        String a = br.readLine();
        char c[] = a.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){
                System.out.println(c[i]);
            }
        }
    }
}
