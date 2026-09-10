import java.util.Arrays;
import java.util.Scanner;
public class RightRotation {
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
        rightRotate(arr, size);
        System.out.print("Left Rotated Array :"+Arrays.toString(arr));
        scanner.close();
    }
    public static void rightRotate(int[] arr, int size) {
        int last = arr[arr.length - 1];
        for(int i = size - 1;i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}

