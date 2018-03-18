package _02_function_interface.car;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //1.构造器引用
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);
        //2.静态方法引用
        cars.forEach(Car::collide);
        //3.特定类的任意对象的方法引用
        cars.forEach(Car::repair);
        //4.特定对象的方法引用
        cars.forEach(car::follow);
    }
}
