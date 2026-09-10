 import java.util.Scanner;
public class AlphaVowelNumeric {
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String :");
         String input = sc.nextLine();
         int a = 0;
         int v = 0;
         int d = 0;
         int s = 0;
         for (int i = 0;i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                 switch (ch){
                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':
                     case 'u':
                     case 'A':
                     case 'E':
                     case 'I':
                     case 'O':
                     case 'U':
                         v++;
                         break;
                     default:
                         a++;
                 }
            }else if(Character.isDigit(ch)){
                 d++;
            }else{
                 s++;
            }
        }
        System.out.println("---Character Analysis---");
        System.out.println("Total Alphabets :"+ a);
        System.out.println("Total Digits : "+ d);
        System.out.println("Total Vowels : "+ v);
        System.out.println("Total Symbols : "+ s);
    
    }
}


