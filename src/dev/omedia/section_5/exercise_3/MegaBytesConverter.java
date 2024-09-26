package dev.omedia.section_5.exercise_3;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = (int) kiloBytes / 1024;

        int leftOverKiloBytes = (int) kiloBytes % 1024;

        String conversionToPrint = String.format("%d KB = %d MB and %d KB", kiloBytes, megaBytes, leftOverKiloBytes);

        String output = kiloBytes < 0 ? "Invalid Value" : conversionToPrint;

        System.out.println(output);
    }

}

