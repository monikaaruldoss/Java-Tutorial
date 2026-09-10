public class MinimumNumArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = findMinimum(arr);
        System.out.println("Minimum number in the array: " + max);
    }
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
