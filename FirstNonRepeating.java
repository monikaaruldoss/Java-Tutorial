import java.util.*;

public class FirstNonRepeating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> number = new ArrayList<> ();
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter Numbers: ");
        for (int i = 0; i< n; i++){
            number.add(sc.nextInt());
        }
        int firstNonRepeating = -1;
        for (int i = 0; i < number.size(); i++){
            int count = 0;
            for(int j = 0; j < number.size(); j++){
                if (number.get(i).equals(number.get(j))){
                    count++;
                }
            }
            if(count == 1){
                firstNonRepeating = number.get(i);
                break;
            }
        }
        if(firstNonRepeating !=-1){
            System.out.println("First Non Repeating : " + firstNonRepeating);
        }else{
            System.out.println("No non-repeating elements found");
        }
        sc.close();
    }
} 
