import java.util.Scanner;
public class CharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Characters are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }sc.close();
    }
}