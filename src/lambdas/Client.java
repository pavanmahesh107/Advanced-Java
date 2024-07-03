package lambdas;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!, Printing by default"+Thread.currentThread().getName());
        Runnable runnable = () ->
            System.out.println("Hello World!, Printing by Runnable Interface "+Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
