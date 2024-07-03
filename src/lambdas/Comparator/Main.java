package lambdas.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Rishi",1,80),
                new Student("Deepak",2,75),
                new Student("krithi",3,89),
                new Student("sasi",4,86)
        );

        Comparator<Student> marksComparator = (st1,st2) -> st1.marks - st2.marks;
        Comparator<Student> rollNumberComparator  = (st1,st2) -> st1.rollNumber - st2.rollNumber;
        Collections.sort(studentList,marksComparator);
//        Collections.sort(studentList,rollNumberComparator);

        System.out.println(studentList);
    }
}
