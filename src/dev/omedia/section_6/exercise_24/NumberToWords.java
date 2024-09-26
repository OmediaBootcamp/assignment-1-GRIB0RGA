package dev.omedia.section_6.exercise_24;

public class NumberToWords {

    public static int getDigitCount(int number) {
        return number < 0 ? -1 : number == 0 ? 1 : (int) Math.log10(number) + 1;
    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }


    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);

        int leadingZeroes = getDigitCount(number) - getDigitCount(reversedNumber);

        // use loop to print words
        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversedNumber /= 10;
        }

        int i = 0;
        while (i < leadingZeroes) {
            System.out.println("Zero");
            i++;
        }

    }

}
