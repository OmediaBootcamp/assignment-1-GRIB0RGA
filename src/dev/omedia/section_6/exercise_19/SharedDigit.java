package dev.omedia.section_6.exercise_19;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        boolean firstNumberIsValid = number1 < 10 || number2 < 10;
        boolean secondNumberIsValid = number1 > 99 || number2 > 99;
        if (firstNumberIsValid || secondNumberIsValid) {
            return false;
        }

        while (number1 > 0) {
            int lastDigit = number1 % 10;
            if (String.valueOf(number2).contains(String.valueOf(lastDigit))) {
                return true;
            }
            number1 /= 10;
        }

        return false;
    }
}
