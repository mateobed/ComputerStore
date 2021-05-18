package Calculator;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Podaj x: ");
        double x = scanner.nextDouble();
        System.out.println("Podaj y: ");
        double y = scanner.nextDouble();
        System.out.println("x + y = " + calculator.add(x,y));
        System.out.println("x * y = " + calculator.multiply(x,y));
    }
}
