import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args){
        ArrayList <Integer> scores = new ArrayList<>();
        scores.add(20);
        scores.add(30);
        scores.add(40);
        scores.add(50);
        scores.set(2,95);
        scores.remove(0);
        for (int score : scores){
            System.out.println("Score : " + score);
        }
    }
}
