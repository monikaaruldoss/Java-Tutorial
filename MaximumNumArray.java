
public class MaximumNumArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = findMaximum(arr);
        System.out.println("Maximum number in the array: " + max);
    }
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
