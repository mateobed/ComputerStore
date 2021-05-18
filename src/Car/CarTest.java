package Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(10,true,true,true,false);
        car1.start();
        System.out.println(car1.status());
        System.out.println();
        System.out.println("Otwarice drzwi");
        car1.setDoorsOpen(true);
        System.out.println(car1.status());
        System.out.println();

    }
}
