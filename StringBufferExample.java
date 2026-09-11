public class StringBufferExample {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer ("Java");
        sb.append("Programming");
        sb.insert(4, "Full");
        sb.replace(5, 9, "Great");
        sb.delete(4, 9);
        sb.reverse();
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);
    }
}
