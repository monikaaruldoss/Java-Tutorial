import java.io.*;
public class MathOps{
    public static void main(String [] m) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter First Number:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(b/a));
        System.out.println("Remainder/Modulo : "+(b % a));
    }
}