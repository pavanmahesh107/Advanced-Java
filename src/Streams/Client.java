package Streams;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Alice","bob","charlie","david","edward");

//        List<String> greater3 = words.stream().filter(wor -> wor.length() > 3).toList();
//        List<String> toUppercase = words.stream().map(word -> word.toUpperCase()).toList();

          List<String> filterNames = words.stream()
                  .filter(word -> word.length() > 3)
                  .map(String -> String.toUpperCase()).toList();

        System.out.println(filterNames);

        List<Integer> number = Arrays.asList(1,9,5,3,10);

        List<Integer> square = number.stream().map(numbers -> numbers *9).toList();
        System.out.println(square);
    }
}
