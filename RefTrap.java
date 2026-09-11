class TCSBox {
    int value = 10;
}
public class RefTrap{
    public static void main(String[] args){
        TCSBox b1 = new TCSBox();
        TCSBox b2 = b1;
        TCSBox b3 = new TCSBox();
        b2.value = 50;
        b3.value = 20;
        System.out.println(b1.value);
        System.out.println(b2.value);
        System.out.println(b3.value);
    }
}
