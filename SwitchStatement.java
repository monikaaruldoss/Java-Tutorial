import java.io.*;
public class SwitchStatement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number between 1 and 5: ");
        int number = Integer.parseInt(br.readLine());
        switch (number) {
            case 1:
                System.out.println("You entered One");
                break;
            case 2:
                System.out.println("You entered Two");
                break;
            case 3:
                System.out.println("You entered Three");
                break;
            case 4:
                System.out.println("You entered Four");
                break;
            case 5:
                System.out.println("You entered Five");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
        }
    }
}
