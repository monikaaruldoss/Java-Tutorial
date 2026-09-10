import java.io.*;
public class AverageOfArray {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double average = (double) sum/size;
        System.out.println("Average of Array Elements: " + average);   
    }  

}
