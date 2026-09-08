import java.io.*;
public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("Enter second number: ");
        double num2 = Double.parseDouble(br.readLine());
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = br.readLine().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return;
        }
        System.out.println("The result is: " + result);
    }
}
