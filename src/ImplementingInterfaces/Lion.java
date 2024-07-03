package ImplementingInterfaces;

//Implementing the Interface in a Class

public class Lion implements MyInterface{
    @Override
    public void makeSound() {
        System.out.println("Lion makes ROAR, ROAR Sound!");
    }
    public static void main(String[] args) {

        MyInterface myInterface = new Lion();
        myInterface.makeSound();
    }
}
