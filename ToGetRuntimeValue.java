import java.io.*;
public class ToGetRuntimeValue {
    public static void main(String[] main) throws IOException {
        BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name: ");
        String name = ar.readLine();
        System.out.println("Enter Your Age: ");
        int age = Integer.parseInt(ar.readLine());
        System.out.println("Enter Your Salary: ");
        double salary = Double.parseDouble(ar.readLine());
        System.out.println("Your Name is: " + name);
        System.out.println("Your Age is: " + age);
        System.out.println("Your Salary is: " + salary);
    }
}
