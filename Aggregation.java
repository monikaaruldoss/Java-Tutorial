public class Aggregation {
    int square(int n){
        return n*n;
    }
}
class Circle {
    Aggregation op;
    double pi = 3.14;
    double area (int radius){
        op = new Aggregation();
        int square = op.square(radius);
        return pi * square;
    }
}
class Main{
    public static void main(String[] args){
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
