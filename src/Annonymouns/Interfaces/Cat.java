package Annonymouns.Interfaces;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Animal is making Sound");
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
    }

    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.makeSound();
        animal.sleep();
        Animal.eat();
    }
}
