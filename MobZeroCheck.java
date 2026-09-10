import java.io.*;
public class MobZeroCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the mobile number: ");
        String mobileNumber = br.readLine();
        int s = mobileNumber.indexOf('0');
        if (s >= 0) {
            System.out.println("The zero is present");
        } else {
            System.out.println("The zero is not present");
        }
    }
        
}
