package dev.omedia.section_6.exercise_20;

public class LastDigitChecker {

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int lastDigitOfFirstNumber = number1 % 10;
        int lastDigitOfSecondNumber = number2 % 10;
        int lastDigitOfThirdNumber = number3 % 10;

        return lastDigitOfFirstNumber == lastDigitOfSecondNumber || lastDigitOfFirstNumber == lastDigitOfThirdNumber || lastDigitOfSecondNumber == lastDigitOfThirdNumber;
    }
}
