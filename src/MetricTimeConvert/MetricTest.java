package MetricTimeConvert;

import java.util.Scanner;

public class MetricTest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość metrów: ");
        double meters = scanner.nextDouble();
        MetricConverter metricConverter = new MetricConverter();
        System.out.println(meters + "metrów to " + metricConverter.metersToCm(meters) + "cm, "
        + metricConverter.metersToMm(meters) + "mm");
    }
}
