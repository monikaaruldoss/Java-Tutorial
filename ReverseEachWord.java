import java.util.StringTokenizer;
import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String sentence = sc.nextLine() ;
        StringTokenizer token = new StringTokenizer(sentence) ;
        StringBuffer FinalResult = new StringBuffer();
        while(token.hasMoreTokens()){
            String word = token.nextToken();
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            FinalResult.append(temp);
            if(token.hasMoreTokens()){
                FinalResult.append(" ");
            }
        }System.out.println("Reversed Sentence : "+FinalResult);
    }
}
