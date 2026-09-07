import java.io.*;
public class PersonalInfo{
    public static void main(String [] p) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name : ");
        String name = br.readLine();
        System.out.println("Enter Your Age : ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Salary : ");
        double salary = Double.parseDouble(br.readLine());
        System.out.println("Enter Your Father Name : ");
        String father = br.readLine();
        System.out.println("Enter Your Mother Name : ");
        String mother = br.readLine();
        System.out.println("Name : "+name+"\nAge : "+age+"\nSalary : "+salary+"\nFather Name : "+father+"\nMother Name : "+mother);
    }
}