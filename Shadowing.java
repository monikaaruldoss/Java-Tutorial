class SuperClass {
    int data = 10 ;
}
class SubClass extends SuperClass{
    int data = 50;
}
public class Shadowing{
    public static void main(String[] args){
        SuperClass obj = new SubClass();
        SubClass obj1 = new SubClass();
        System.out.println(obj.data);
        System.out.println(obj1.data);

    }
}
