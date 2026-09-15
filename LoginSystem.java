import java.util.Scanner;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message){
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message){
        super(message);
    }
}
public class LoginSystem {
    static void login(String username, String password) throws InvalidUsernameException , InvalidPasswordException{
        String correctUsername = "admin";
        String correctPassword = "java123";
        if(!username.equals(correctUsername)){
            throw new InvalidUsernameException("Invalid Username");
        }
        if(!password.equals(correctPassword)){
            throw new InvalidPasswordException("Invalid Password");
        }System.out.println("Login Successful");
    }
    public static void main(String [] args){
        int attempts = 3;
        while(attempts > 0){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Username :");
                String Username = sc.nextLine();
                System.out.println("Enter Password :");
                String Password = sc.next();
                login(Username, Password);
                sc.close();
                break;
            }catch(InvalidUsernameException e){
                attempts--;
                System.out.println(e.getMessage());
                if(attempts >0){
                    System.out.println("Attempts Remaining :"+ attempts);
                }
            }catch(InvalidPasswordException e){
                attempts--;
                System.out.println(e.getMessage());
                if(attempts >0){
                    System.out.println("Attempts Remaining :"+ attempts);
                }
            }finally{
                System.out.println("-----------------------------");
            }
        }
        if(attempts == 0 ){
            System.out.println("Account Locked");
        }
    }
}
