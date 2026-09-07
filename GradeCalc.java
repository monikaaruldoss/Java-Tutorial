import java.io.*;
public class GradeCalc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name : ");
        String name = br.readLine();
        System.out.println("Enter Your Registration Number : ");
        String regNumber = br.readLine();
        System.out.println("Enter Your Marks : ");
        int marks = Integer.parseInt(br.readLine());
        if(marks < 35){
            System.out.println("Fail");
        }else if(marks >=35 && marks < 50){
            System.out.println("Grade C");
        }else if(marks >=50 && marks < 70){
            System.out.println("Grade B");
        }else if(marks >=70 && marks < 80){
            System.out.println("Grade A");
        }else if(marks >=80 && marks < 90){
            System.out.println("Grade A+");
        }else if(marks >=90 && marks <=100){
            System.out.println("Grade O");
        }
        br.close();
    }
}
