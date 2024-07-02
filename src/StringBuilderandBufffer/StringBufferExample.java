package StringBuilderandBufffer;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" pavan");
        sb.insert(6, "mahesh ");
//        sb.delete(11, 16);
        System.out.println(sb.toString());
    }
}
