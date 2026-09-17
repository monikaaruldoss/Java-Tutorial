import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList <Integer> duplicate = new ArrayList<> ();
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers: ");
        for( int i = 0; i < n; i++){
            numbers.add(sc.nextInt());
        }
        for(int i = 0 ; i < numbers.size(); i++){
            int count = 0;
            for(int j = 0; j < numbers.size(); j++){
                if(numbers.get(i).equals(numbers.get(j)))
                    count++;
            }
            if (count > 1 && !duplicate.contains(numbers.get(i))){
                duplicate.add(numbers.get(i));
            }
        }
        System.out.println("ArrayList: " + numbers);
        System.out.println("Elements occurring more than once: " + duplicate);
        sc.close();
    }
}
