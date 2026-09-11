class Student {
    String name;
    int age;
    Student(){
        this.name = "Kumar";
        this.age = 20;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class StudentConstructor{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.display();
    }
}