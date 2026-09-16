class Student{
    String name;
    int age;
    Student(){
        this.name = "Jose";
        this.age = 20;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class ConstructorEx {
    public static void main(String [] main){
        Student s1 = new Student(); 
        s1.display();
    }
}
