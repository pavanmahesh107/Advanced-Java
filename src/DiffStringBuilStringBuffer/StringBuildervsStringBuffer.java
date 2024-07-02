package DiffStringBuilStringBuffer;

public class StringBuildervsStringBuffer {
    private static final int ITERATIONS = 10000;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("StringBuilder Test: ");
        runTestWithStringBuilder();

        System.out.println("StringBuffer Test: ");
        runTestWithStringBuffer();
    }

    // String Builder is used in Single Threaded Environment, So there is no thread safe. And it's not synchronized, so it is faster.
    // The performance of a String Builder is better compared to String Buffer in a Single-threaded environment due to lack of synchronization overhead.
    private static void runTestWithStringBuilder() throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();

        Runnable Task = () -> {
            for (int i = 0; i < ITERATIONS; i++) {
                stringBuilder.append("a");
            }
        };

        //Create multiple threads to modify the String Builder.
        Thread t1 = new Thread(Task);
        Thread t2 = new Thread(Task);

        long starttime = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long endtime = System.nanoTime();

        System.out.println("Length: " + stringBuilder.length());
        System.out.println("Time Taken: " + (endtime - starttime / 1_000_000 + "ms"));

    }

    // String Buffer is used in Multi Threaded Environment, So it is Thread safe and is synchronized but slower than the string builder.
    // The performance of String Buffer is well in a multi-Threaded environment where thread safety is required.
    private static void runTestWithStringBuffer() throws InterruptedException {
        StringBuffer stringBuffer = new StringBuffer();
        Runnable Task = () -> {
            for (int i = 0; i < ITERATIONS; i++) {
                stringBuffer.append("a");
            }
        };

        //Creating multiple Threads to modify the string buffer.
        Thread t1 = new Thread(Task);
        Thread t2 = new Thread(Task);

        long starttime = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long endtime = System.nanoTime();

        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Time Taken: " + (endtime - starttime) / 1_000_000 + "ms");
    }
}
