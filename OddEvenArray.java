import java.io.*;
public class OddEvenArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int Even = 0;
        int Odd = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Array Values:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }
        System.out.println("Number of Even Numbers: " + Even);
        System.out.println("Number of Odd Numbers: " + Odd);
    }
}
