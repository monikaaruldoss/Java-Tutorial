public class ThrowEx {
    public static void main(String [] args){
        int age = 20;
        if (age < 18){
            throw new ArithmeticException("Student is not Eligible");
        }else{
            System.out.println("Student is Eligible"); 
        } 
    }
}
