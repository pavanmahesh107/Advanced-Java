package ImplementingInterfaces;


//Using Anonymous Inner Classes

public class Main {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass() {
            @Override
            public void myInterface() {
                System.out.println("Method implemented using the inner class.");
            }
        };
        innerClass.myInterface();
    }
}
