package StringBuilderandBufffer;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        //Append Strings to the String Builder.
        sb.append(" is");
        sb.append(" awesome!");
        // Print the current state of the StringBuilder
        System.out.println("After appending: "+sb.toString());

        //Insert a string at a specific position in this String
        sb.insert(5,"really ");
        // Print the current state of the StringBuilder
        System.out.println("After Inserting: "+sb.toString());

        //Reverse the characters in the StringBuilder;
        sb.reverse();
        // Print the current state of the StringBuilder
        System.out.println("After reversing: "+sb.toString());

        //Delete the portion of the String(from index 0 to 8);
        sb.delete(0,8);
        // Print the current state of the StringBuilder
        System.out.println("after deleting: "+sb.toString());

        //replace a portion of the String(from index 3 to 9);
        sb.replace(3,9,"super");
        // Print the current state of the StringBuilder
        System.out.println("After replacing: "+sb.toString());

    }
}
