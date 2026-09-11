import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        String r = "";
        char[] c = s.toCharArray();
        for(int i = c.length-1;i >= 0; i--){
            r += c[i];
        }
        System.out.println(s);
        System.out.println(r);
    }
}
