package dev.omedia.section_6.exercise_26;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrimeDivisor = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i > largestPrimeDivisor) {
                // Check if i is a prime number
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrimeDivisor = i;
                }
            }
        }
        return largestPrimeDivisor;
    }

}
