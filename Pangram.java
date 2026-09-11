import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Sentence:");
        String sentence = sc.nextLine();
        String lower = sentence.toLowerCase();
        boolean Pangram = true;
        for(char ch = 'a'; ch <= 'z'; ch++){
            String letter = String.valueOf(ch);
            if(!lower.contains(letter)){
                Pangram = false;
                break;
            }
        }
        if(Pangram){
            System.out.println("\n Yes!The sentence is a Program");
        }else{
            System.out.println("\n No!The sentence is not a Program");
        }sc.close();
    }
}
