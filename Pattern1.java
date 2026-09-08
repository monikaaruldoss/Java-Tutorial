import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char ch = 'a';
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // Odd row: print *
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // Even row: print same letter
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                }
                ch += 2;
            }
            System.out.println();
        }
        sc.close();
    }
}