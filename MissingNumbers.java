import java.util.Scanner;
import java.util.ArrayList;
public class MissingNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList <> ();
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter " + (n - 1) + " numbers: ");
        for(int i = 0; i < n-1; i++){
            numbers.add(sc.nextInt());
        }
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i = 0; i <numbers.size(); i++){
            actualSum = actualSum + numbers.get(i);
        }
         int missing = expectedSum - actualSum;
         System.out.println("ArrayList: " + numbers);
         System.out.println("Missing Number: " + missing);
         sc.close();
    }
}
