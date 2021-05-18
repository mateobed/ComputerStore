package Telephone.app;

import Telephone.logic.Charger;
import Telephone.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("Samsung", "Galaxy", 3400, 75);
        telephone1.printInfo();

        Charger charger = new Charger();

        charger.charge(telephone1);
        charger.charge(telephone1);
        charger.charge(telephone1);
        charger.charge(telephone1);
        charger.charge(telephone1);

        System.out.println("Telefon po naładowaniu:");
        telephone1.printInfo();
    }
}
