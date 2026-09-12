import java.util.Scanner;
class Student{
    private int studentId;
    private String studentName;
    private int courseCount;
    private String []courses;
    Student(int studentId, String studentName, int countCourses){
        this.studentId = studentId;
        this.studentName = studentName;
        courses = new String[countCourses];
        courseCount = 0;
    }
    void RegisteredCourses(String course){
            courses[courseCount] = course;
            courseCount++;
    }
    void display(){
        System.out.println("Student ID: " + studentId); 
        System.out.println("Student Name :" + studentName);
        System.out.println("Student Course Count :" + courseCount);
        System.out.println("Student Courses :");
        for(int i = 0; i < courseCount; i++){
            System.out.println(courses[i]);
        }
    }
}
public class StudentRegistration{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID :");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name :");
        String studentName = sc.next();
        System.out.println("Enter Student Course Count :");
        int courseCount = sc.nextInt();
sc.nextLine();
        System.out.println("Enter Student Courses :");
        Student s1 = new Student(studentId, studentName, courseCount);
        for(int i = 0; i < courseCount; i++){
            String courses = sc.nextLine();
            s1.RegisteredCourses(courses);
        }
        s1.display(); 
        sc.close();  
    }
}
