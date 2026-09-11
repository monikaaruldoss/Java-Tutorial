import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String pass = sc.nextLine();
        int sa = 0;
        if (pass.length() >= 8){
            sa++;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigits = false;
        for( int i = 0; i < pass.length(); i++){
            char ch = pass.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                hasUpper = true;
            }else if (ch >= 'a' && ch <= 'z'){
                hasLower = true;
            }else if (ch >= '0' && ch <= '9'){
                hasDigits = true;
            }
        }
            if(hasUpper){
                sa++;
            }if(hasLower){
                sa++;
            }if(hasDigits){
                sa++;   
        }System.out.println("Verdict");
            if(sa == 4){
                System.out.println("Password Strength : STRONG");
            }else if(sa == 3){
                System.out.println("Password Strength : MEDIUM");        
            }else{
                System.out.println("Password Strength : WEAK");
            
        }sc.close();
    }
}
