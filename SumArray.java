import java.io.*;
public class SumArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = sumArray(arr);
        System.out.println("Sum of Array Elements: " + sum);
    }
     public static int sumArray(int[] arr) {
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
}
