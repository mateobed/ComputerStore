package NumberInfo;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Wylosowana liczba: " + randomNumber);

        NumbersUtils numbersUtils = new NumbersUtils();
        numbersUtils.compareTwoNumbers(randomNumber,5000);
        numbersUtils.printOddOrEven(randomNumber);
        numbersUtils.getFourDigitNumber(randomNumber);
        System.out.println("Uzupełniona do 4 cyfr: " + numbersUtils.getFourDigitNumber(randomNumber));





    }
}
