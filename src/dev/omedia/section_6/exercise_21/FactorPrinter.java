package dev.omedia.section_6.exercise_21;

public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        String outputToPrint = "";

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                outputToPrint += " " + i;
            }
        }
        System.out.println(outputToPrint);
    }
}
