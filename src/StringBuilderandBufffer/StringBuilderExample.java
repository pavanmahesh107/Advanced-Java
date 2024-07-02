package StringBuilderandBufffer;

public class StringBuilderExample {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(6, "Java ");
        sb.delete(11,16);
        System.out.println(sb.toString());
    }
}
