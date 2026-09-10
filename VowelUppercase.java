import java.util.Scanner;
public class VowelUppercase {
   public static void main(String[] var0) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Vowels in Uppercase are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                arr[i] == 'o' || arr[i] == 'u') {
                System.out.print(Character.toUpperCase(arr[i]));
            }else {
                System.out.print(arr[i]);
            }
        }sc.close();
   }
}