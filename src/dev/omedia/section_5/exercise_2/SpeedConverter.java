package dev.omedia.section_5.exercise_2;

public class SpeedConverter {

    private static final double CONVERSION_FACTOR = 1.609;

    public static long toMilesPerHour(double kilometersPerHour) {
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / CONVERSION_FACTOR);
    }

    public static void printConversion(double kilometersPerHour) {
        String conversionToPrint = String.format("%s km/h = %d mi/h", kilometersPerHour, toMilesPerHour(kilometersPerHour));
        String output = kilometersPerHour < 0 ? "Invalid Value" : conversionToPrint;
        System.out.println(output);
    }
}
