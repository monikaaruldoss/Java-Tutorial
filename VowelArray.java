import java.util.Scanner;
public class VowelArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Vowels are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                arr[i] == 'o' || arr[i] == 'u') {
                System.out.println(arr[i]);
            }
        }
    }
}