package CarShop.logic;

import CarShop.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2014, "Audi", "A5", "Czarny");
        Car car2 = new Car(2015, "Audi", "A4");
        car2.setColor("White");
        car2.setYear(-1000);

        System.out.println(car1.getBrand() + " " + car1.getModel() + " " + car1.getYear() + " " + car1.getColor());
        System.out.println(car2.getBrand() + " " + car2.getModel() + " " + car2.getYear() + " " + car2.getColor());
    }
}
