import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}