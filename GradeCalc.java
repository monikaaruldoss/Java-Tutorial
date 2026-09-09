import java.io.*;
public class GradeCalc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name : ");
        String name = br.readLine();
        System.out.println("Enter Your Registration Number : ");
        String regNumber = br.readLine();
        System.out.println("Enter Your Marks in Subject 1: ");
        int marks = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Marks in Subject 2: ");
        int marks2 = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Marks in Subject 3: ");
        int marks3 = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Marks in Subject 4: ");
        int marks4 = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Marks in Subject 5: ");
        int marks5 = Integer.parseInt(br.readLine());
        int totalMarks = marks + marks2 + marks3 + marks4 + marks5;
        System.out.println("Total Marks : " + totalMarks);
        double average = totalMarks / 5.0;
        System.out.println("Average: " + average);
        System.out.println("\n~~~Student Result~~~");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + average);
        if (marks < 35 || marks2 < 35 || marks3 < 35 || marks4 < 35 || marks5 < 35) {
            System.out.println("Result: FAIL");
            System.out.println("Grade: F");
        } else {
            System.out.println("Result: PASS");
            if (average >= 90) {
                System.out.println("Grade: A+");
            } else if (average >= 80) {
                System.out.println("Grade: A");
            } else if (average >= 70) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else if (average >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
        }
        br.close();
    }
}
