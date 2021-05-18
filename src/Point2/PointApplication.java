package Point2;

import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie wartości: ");
        Point point1 = new Point();
        point1.setX(scanner.nextInt());
        point1.setY(scanner.nextInt());
        System.out.println("Wartości początkowe X = " + point1.getX() + "; Y = " + point1.getY());
        PointController pc = new PointController();

        System.out.println("Wybierz opcję: ");
        System.out.println("1 - X + 1");
        System.out.println("2 - X - 1");
        System.out.println("3 - Y + 1");
        System.out.println("4 - Y - 1");

        int choose = scanner.nextInt();

        switch (choose){
            case 1:
                pc.addX(point1);
                System.out.println("Po modyfikacji X = " + point1.getX() + "; Y = " + point1.getY());
                break;
            case 2:
                pc.minusX(point1);
                System.out.println("Po modyfikacji X = " + point1.getX() + "; Y = " + point1.getY());
                break;
            case 3:
                pc.addY(point1);
                System.out.println("Po modyfikacji X = " + point1.getX() + "; Y = " + point1.getY());
                break;
            case 4:
                pc.minusY(point1);
                System.out.println("Po modyfikacji X = " + point1.getX() + "; Y = " + point1.getY());
                break;
            default:
                System.out.println("Błędna opcja");
                break;
        }


    }
}
