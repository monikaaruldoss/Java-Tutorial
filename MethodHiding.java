class Parent{
    static void Print(){
        System.out.println("Parent Static");
    }
}
class Child extends Parent{
    static void Print(){
        System.out.println("Child Static");
    }
}
public class MethodHiding {
    public static void main(String [] args){
        Parent obj = new Child();
        obj.Print();
    }
}
