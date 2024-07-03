package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    List<Student> students = Arrays.asList(
            new Student("A", 1, 80),
            new Student("B", 2, 85),
            new Student("C", 3, 90),
            new Student("D", 4, 89),
            new Student("E", 5, 97),
            new Student("F", 6, 70)
    );
    Comparator<Student> marksComparator = (st1, st2) -> st1.Marks - st2.Marks;
//    Collections.sort(students,marksComparator);



}
