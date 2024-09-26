package dev.omedia.section_6.exercise_27;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int row = 1;
        while (row <= number) {
            int column = 1;
            while (column <= number) {
                boolean checkIfItIsTheFirstOrLastRow = row == 1 || row == number; // First and last row should only have stars
                boolean checkIfItIsTheFirstOrLastColumn = column == 1 || column == number; // First and last column should only have stars
                boolean checkIfRowAndColumnOverlaps = row == column || (column == (number - row + 1)); // If row and column overlaps we should see star there

                boolean shouldRenderStar = checkIfItIsTheFirstOrLastRow || checkIfItIsTheFirstOrLastColumn || checkIfRowAndColumnOverlaps;
                System.out.print(shouldRenderStar ? "*" : " ");
                column++;
            }
            System.out.println(); // Jump to next line
            row++;
        }
    }
}
