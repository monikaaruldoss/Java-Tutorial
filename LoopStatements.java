public class LoopStatements {
    public static void main(String[] args) {
        int i = 1;
        //While Loop
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("While loop completed.");
        //Do-While Loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
        System.out.println("Do-while loop completed.");
        //For Loop
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }
        System.out.println("For loop completed.");
        //For-each Loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);    
        }
        System.out.println("For-each loop completed.");
        //Labeled For Loop
        outerLoop:
        for (int m = 1; m <= 3; m++) {
            innerLoop:
            for (int n = 1; n <= 3; n++) {
                if (m == 2 && n == 2) {
                    break outerLoop; // Breaks out of the outer loop
                }
                System.out.println("m: " + m + ", n: " + n);
            }
        }
        System.out.println("Labeled for loop completed.");
    }
}
