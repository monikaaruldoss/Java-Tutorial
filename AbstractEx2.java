abstract class Shape{
    String color;
    public Shape(String color){
        this.color = color;
    }
    abstract double getArea();
    public void displayColor(){
        System.out.println("The shape is : " + color);
    }
}
class Circle extends Shape{
    double radius;
    public Circle (String color , double radius){
        super(color);
        this.radius = radius;
    }
    @Override 
    double getArea(){
        return Math.PI * radius * radius;
    }
}
public class AbstractEx2 {
    public static void main(String [] args){
        Shape myCircle = new Circle("Blue" , 5.0);
        myCircle.displayColor();
        System.out.println("Area : " + myCircle.getArea());
    }
}
