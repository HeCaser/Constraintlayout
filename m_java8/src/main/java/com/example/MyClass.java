package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MyClass {
    public class Person implements Functional {

        @Override
        public void method() {

        }
    }

    public static class Car {
        public static Car create(final Supplier<Car> supplier) {
            return supplier.get();
        }

        public static void collide(final Car car) {
            System.out.println("Collided " + car.toString());
        }

        public void follow(final Car another) {
            System.out.println("Following the " + another.toString());
        }

        public void repair() {
            System.out.println("Repaired " + this.toString());
        }
    }


    public static void main(String[] args) {
        String s = ",";
        Arrays.asList("a", "b", "c").forEach(System.out::print);
        Arrays.asList("a", "b", "c").sort(String::compareTo);

        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        cars.forEach(Car::collide);

        cars.forEach(Car::repair);

        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }
}
