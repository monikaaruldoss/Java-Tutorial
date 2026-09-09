import java.util.Scanner;
public class BusSeatArrangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = 5;
        int cols = 4;
        char[][] seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 0;
            }
        }
        System.out.println("Bus Seat Arrangement:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + (i+1) + "," + (j+1) + "]");
            }
            System.out.println();
        }System.out.println("Enter the seat number in row : ");
        int row1 = sc.nextInt();
        System.out.println("Enter the seat number in column : ");
        int col1 = sc.nextInt();
        if (row1 <1 || row1 > rows || col1 <1 || col1 > cols) {
            System.out.println("Invalid seat number.");
        } else if (seats[row1-1][col1-1] == 1) {
            System.out.println("Seat is already booked.");
        } else {
            seats[row1-1][col1-1] = 1; 
            System.out.println("Seat booked successfully.");
        }System.out.println("Final Seat Arrangement");
        for(int i = 0;i<rows;i++){
            for (int j = 0 ; j < cols;j++){
                if (seats[i][j]==0){
                    System.out.print("[Available] ");
                }else{
                    System.out.print("[Booked] ");
                }
            }System.out.println();
        }sc.close();
    }
}
