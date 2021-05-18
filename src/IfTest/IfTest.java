package IfTest;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        User user1 = new User("Jan", "Kowalski");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz opcje: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikacja danych");

        int choose = scanner.nextInt();

        if(choose == 0){
            System.out.println("Bye bye");
        } else if (choose == 1){
            System.out.println(user1.getFirstName() + " " + user1.getLastName());
        } else if (choose == 2) {
            user1.setFirstName("Olek");
            user1.setLastName("Drabek");
            System.out.println("Zmodyfikowane dane: " + user1.getFirstName() + " " + user1.getLastName());
        } else {
            System.out.println("Błędna opcja!");
        }

    }
}
