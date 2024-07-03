package Comparable;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("A",200,"Honda");
        Car car2 = new Car("B",500,"Hero");
        Car car3 = new Car("C",1000,"MG");
        Car car4 = new Car("D",700,"Benz");
        Car car5 = new Car("E",100,"Tesla");
        Car car6 = new Car("F",900,"Maruti");

        Queue<Car> pq = new PriorityQueue<>();

        pq.add(car1);
        pq.add(car2);
        pq.add(car3);
        pq.add(car4);
        pq.add(car5);
        pq.add(car6);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
