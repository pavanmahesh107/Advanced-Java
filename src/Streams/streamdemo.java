package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamdemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 9, 6, 5, 3, 14, 18, 45, 96, 34);

        //Write a method to extract only Odd numbers from the List.

        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer numbers : list) {
            if (numbers % 2 == 1) {
                oddNumbers.add(numbers);
            }
        }
        System.out.println(oddNumbers);
    }
}
