package dev.omedia.section_6.exercise_15;

public class SumOddRange {
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int startingNumber, int endingNumber) {

        if (startingNumber < 0 || startingNumber > endingNumber) {
            return -1;
        }

        int sum = 0;

        for (int i = startingNumber; i <= endingNumber; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
