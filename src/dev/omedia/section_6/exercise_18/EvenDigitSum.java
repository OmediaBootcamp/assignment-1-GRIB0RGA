package dev.omedia.section_6.exercise_18;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                sumOfEvenDigits += lastDigit;
            }
            number /= 10;
        }
        return sumOfEvenDigits;
    }

}
