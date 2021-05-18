package Dice;

public class DiceTest {
    public static void main(String[] args) {

        Dice dice = new Dice();

        dice.roll();
        dice.printInfo();

        dice.roll();
        dice.printInfo();

        Dice dice1 = new Dice(5);

        dice1.roll();
        dice1.printInfo();

        dice1.roll();
        dice.printInfo();


    }
}
