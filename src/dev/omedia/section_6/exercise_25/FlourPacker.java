package dev.omedia.section_6.exercise_25;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int BIG_COUNT_TO_KGS = 5;

        int totalBigWeight = bigCount * BIG_COUNT_TO_KGS;

        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_COUNT_TO_KGS;
            return smallCount >= remaining;
        }

        return smallCount >= goal - totalBigWeight;
    }
}
