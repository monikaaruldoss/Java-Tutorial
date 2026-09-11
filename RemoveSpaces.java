public class RemoveSpaces {
    public static void main(String[] args){
        String s = "  J  a v a   ";
        String str1 = s.replace(" ","");
        System.out.println(str1);

        String t = "java \t is \n fun";
        String str2 = t.replaceAll("\\s","");
        System.out.println(str2);

        String d = "  Hello World  ";
        String str3 = d.strip();
        System.out.println(str3);
    }
}
