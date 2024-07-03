package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Different ways of Initializing the streams.

        List<Integer> numbers = Arrays.asList(1,9,5,0,3,7,8);
        Stream<Integer> stream = numbers.stream();

        Stream<Integer> stream1 = Stream.of(1,9,5,0,3,7,8);

        Stream.Builder<Integer> sb = Stream.builder();
        sb.add(1);
        sb.add(9);
        sb.add(6);
        sb.add(2);
        sb.add(7);
        sb.add(5);
        sb.build();
    }
}
