// in the given string change all e in word  to upper case
import java.util.Scanner;
public class EToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String upperCaseString = input;
        for(int i = 0;i < input.length(); i++){
            if( input.charAt(i) == 'e' || input.charAt(i) == 'E'){
                upperCaseString = upperCaseString.replace(input.charAt(i), 'E');
            }
        }
        System.out.println("Uppercase string: " + upperCaseString);
        sc.close();
    }
}
