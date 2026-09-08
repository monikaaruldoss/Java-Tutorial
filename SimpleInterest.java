import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        float p = sc.nextFloat();
        System.out.print("Enter time in years: ");
        float t = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        float si = (p * t * r) / 100;
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}