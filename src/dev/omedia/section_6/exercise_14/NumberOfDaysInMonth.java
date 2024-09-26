package dev.omedia.section_6.exercise_14;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // Months with 31 days
            case 4, 6, 9, 11 -> 30;// Months with 30 days
            case 2 -> isLeapYear(year) ? 29 : 28; // Days in February based on if it's leap year or not;
            default -> -1;
        };

    }

    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

}
