package dev.omedia.section_6.exercise_22;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestCommonDivisor = 1;

        int lowerNumber = Math.min(first, second);
        int higherNumber = Math.max(first, second);

        for (int i = 1; i <= lowerNumber; i++) {
            if (lowerNumber % i == 0 && higherNumber % i == 0 && i > greatestCommonDivisor) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}
