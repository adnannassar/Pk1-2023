package Vorlesung.Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCode_And_Equals {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200);
        Car car2 = new Car("BMW", 200);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.equals(car2));

        Set<Car> set = new HashSet<>();
        set.add(car1);
        set.add(car2);

        System.out.println(set);
    }

    static class Car {
        String name;
        int speed;

        public Car(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return name + " " + speed;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, speed);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            Car c = (Car) o;
            if(this.speed == c.speed && this.name.equals(c.name)){
                return true;
            }else{
                return false;
            }
        }
    }

}

