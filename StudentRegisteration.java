import java.util.Scanner;
class Student{
    private int studentId;
    private String studentName;
    private int courseCount;
    private String []Courses;
    void Student(int studentId, String studentName, int countCourses){
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseCount = countCourses;
        Courses = new String[courseCount];
    }
    void RegisteredCourses(String []courses){
        for(int i = 0; i < courseCount; i++){
            Courses[i] = courses[i];
        }
    }
    void display(){
        System.out.println("Student ID: " + studentId); 
        System.out.println("Student Name :" + studentName);
        System.out.println("Student Course Count :" + courseCount);
        System.out.println("Student Courses :");
        for(int i = 0; i < courseCount; i++){
            System.out.println(Courses[i]);
        }
    }
}
public class StudentRegisteration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID :");
        int studentId = sc.nextInt();
        System.out.println("Enter Student Name :");
        String studentName = sc.next();
        System.out.println("Enter Student Course Count :");
        int courseCount = sc.nextInt();
        System.out.println("Enter Student Courses :");
        String []courses = new String[courseCount];
        for(int i = 0; i < courseCount; i++){
            courses[i] = sc.next();
        }
        Student s1 = new Student(studentId, studentName, courseCount);
        s1.RegisteredCourses(courses);
        s1.display();   
    }
}
