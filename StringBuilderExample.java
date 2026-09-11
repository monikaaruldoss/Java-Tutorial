public class StringBuilderExample {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder ("Java");
        sb.append("Programming");
        sb.insert(4, "Full");
        sb.delete(4, 9);
        sb.reverse();
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);
    }
}
