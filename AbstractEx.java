abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks..");
    }
}
public class AbstractEx {
    public static void main(String [] args){
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
