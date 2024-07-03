package Comparable;

public class Car implements Comparable<Car> {

    private String name;
    private int power;
    private String model;

    public Car(String name, int power, String model) {
        this.name = name;
        this.power = power;
        this.model = model;
    }

    @Override
    public int compareTo(Car other) {
        return this.power - other.power;
    }

    @Override
    public String toString() {
        return "[name: " + this.name + ", power: " + this.power + ", model: " + this.model + "]";
    }
}
