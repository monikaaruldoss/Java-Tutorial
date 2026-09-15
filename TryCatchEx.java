public class TryCatchEx {
    public static void main(String [] Args){
        try{
            int a = 10 , b = 0 ;
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by Zero");
        }
        System.out.println("Program Continues..");
    }
}
