package MetricTimeConvert;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        TimeConverter timeConverter = new TimeConverter();

        System.out.println("Podaj liczbę godzin: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println(hours + " godzin to " + timeConverter.hoursToMinutes(hours) + " minut.");

        System.out.println("Podaj liczbę minut: ");
        int minutes = scanner.nextInt();
        System.out.println(minutes + " minut to " + timeConverter.minutesToSeconds(minutes) + " sekund.");

        System.out.println("Podaj liczbę sekund: ");
        int seconds = scanner.nextInt();
        System.out.println(seconds + " sekund to " + timeConverter.secondsToMilliseconds(seconds) + " milisekund.");

        int x = 14;
        System.out.println("14 godzin to: " + timeConverter.secondsToMilliseconds(timeConverter.minutesToSeconds(timeConverter.hoursToMinutes(x))) + " milisekund" );

    }
}
