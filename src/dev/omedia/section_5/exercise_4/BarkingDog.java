package dev.omedia.section_5.exercise_4;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && (hourOfDay >= 0 && hourOfDay < 24) && (hourOfDay < 8 || hourOfDay > 22);
    }
}
