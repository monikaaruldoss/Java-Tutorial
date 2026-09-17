class Student1{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String [] args){
        Student1 s = new Student1();
        s.setName("Moni");
        s.setAge(20);

        System.out.println("Name :"+ s.getName());
        System.out.println("Age :" + s.getAge());

    }
}
