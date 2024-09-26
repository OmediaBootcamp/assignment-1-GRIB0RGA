package dev.omedia.section_5.exercise_10;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long days = (minutes % 525600) / 1440;
        System.out.printf("%d min = %d y and %d d%n", minutes, years, days);
    }
}
