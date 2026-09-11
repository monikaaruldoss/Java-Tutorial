public class TCSMainOverload {
    public static void main(String [] args){
        System.out.println("Standard Execution Entry");
        main("TCS");
    }
    public static void main(String args){
        System.out.println("Overload Entry :"+ args);
    }
}
