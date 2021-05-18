package Point.app;

import Point.controller.PointController;
import Point.data.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point();
        PointController pc = new PointController();

        System.out.println("Punkt początkowy:  " + p1.getX() + ";" + p1.getY());
        pc.addX(p1);
        pc.addY(p1);
        System.out.println("Punkt po dodaniu 1:  " + p1.getX() + ";" + p1.getY());
        pc.minusX(p1);
        pc.minusY(p1);
        System.out.println("Punkt po odjęciu 1:  " + p1.getX() + ";" + p1.getY());
        pc.changeObject(p2);
        System.out.println("Punkt po zmianie parametrów:  " + p2.getX() + ";" + p2.getY());



    }
}
