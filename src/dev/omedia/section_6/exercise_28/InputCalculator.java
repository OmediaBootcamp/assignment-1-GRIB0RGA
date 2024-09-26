package dev.omedia.section_6.exercise_28;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }

        long average = Math.round((double) sum / count);
        String messageToOutput = String.format("SUM = %d AVG = %d", sum, average);
        System.out.println(messageToOutput);
        scanner.close();
    }
}
