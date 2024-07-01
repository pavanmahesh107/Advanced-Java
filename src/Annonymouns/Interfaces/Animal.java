package Annonymouns.Interfaces;

public interface Animal {
    int NUMBER_OF_LEGS = 4; //It might be public, static, final

    void makeSound();  //Abstract method

    static void eat(){
        System.out.println("Animal is eating");
    }

    default void sleep(){  //We can override the default methods.
        System.out.println("Animal is sleeping");
    }

}
