import java.util.Arrays;
import java.util.Scanner;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Original Array :"+ Arrays.toString(arr));
        
        scanner.close();
    }
    public static void leftRotate(int[] arr, int rotations) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        rotations = rotations % arr.length; // Handle cases where rotations > array length
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
}
