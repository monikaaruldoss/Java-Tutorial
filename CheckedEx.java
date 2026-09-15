public class CheckedEx {
    public static void main(String [] args){
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is Invalid");
        }
    }
}
