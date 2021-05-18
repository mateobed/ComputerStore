package Hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit){
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjscie z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(scanner.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(scanner.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Zamykamy program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }
        scanner.close();

    }
}
