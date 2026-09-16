import java.io.*;
class base{
    void m1(int a, int b){
        int a1 = a;
        int b1 = b ;
        int c = a1 + b1;
        System.out.println("Output : " + c);
    }
}
public class RunTimeConstructor {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number : ");
        int p = Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number : ");
        int q = Integer.parseInt(br.readLine());
        base b = new base();
        b.m1(p, q);
    }
}
