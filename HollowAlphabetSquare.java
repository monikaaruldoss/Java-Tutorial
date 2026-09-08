import java.util.Scanner;
public class HollowAlphabetSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Hollow Alphabet Square ---");
        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();
        if(size <= 0) {
            System.out.println("Size should be at least 2 to form a hollow square.");
            return;
        }
        char ch = 'A';
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if(i == 1 || i == size || j == 1 || j == size){
                    System.out.print(ch + " ");
                } else {
                    System.out.print("  ");
                }
                ch++;
                if(ch > 'Z') {
                    ch = 'A';
                }
            }
            System.out.println();
        }
    }
}
