package Streams;

import lambdas.Comparator.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamdemo {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 9, 6, 5, 3, 14, 18, 45, 96, 34);
//
//        //Write a method to extract only Odd numbers from the List.
//
//        List<Integer> oddNumbers = new ArrayList<>();
//        for (Integer numbers : list) {
//            if (numbers % 2 == 1) {
//                oddNumbers.add(numbers);
//            }
//        }
//        System.out.println(oddNumbers);
//
//        // How we do the above operation using stream.
//        List<Integer> oddNumbers1 = list.stream().filter( (x) -> x%2 == 1).toList();
//        System.out.println(oddNumbers1);

        // How the above stream works.
        // 1. List will be converted into a Stream.
        // 2. Stream will loop over each element of a list.
        // 3. Every element will be passed in the method.
        // 4. Lambda function will be applied over each element.
        // 5. If a lambda expression returns true, that element will be added to the final stream,
        // else it will be rejected.
        // 6. Finally, we'll convert the stream back to the list.

        List<Student> studentList = Arrays.asList(
                new Student("Rishi",1,80),
                new Student("Deepak",2,75),
                new Student("krithi",3,89),
                new Student("sasi",4,86));

        System.out.println(studentList.stream().filter((student) -> student.marks > 80).toList());



        // Iterate over the list and get the marks of each student.
        System.out.println(studentList.stream().map(student -> student.marks).toList());
//        System.out.println(studentList.stream().map(student -> student.rollNumber).toList());
//        System.out.println(studentList.stream().map(student -> student.name).toList());

//        List<Student> studentList = (students.stream().filter((student) -> student.Marks >= 95).toList());
//        System.out.println(studentList);

        List<String> words = Arrays.asList("scaler","banglore", "india", "class", "oops", "streams", "java");
        // Count the number of words with length > 5
        System.out.println(words.stream().filter(word -> word.length() > 4).count());

        List<String> toUpperCase = words.stream().map(word -> word.toUpperCase()).toList();
        List<String> toUpperCase1 = words.stream().map(String::toUpperCase).toList();
        System.out.println(toUpperCase);

    }
}
