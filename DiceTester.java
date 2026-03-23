package assignment2;

/*
 * Name: Richard Magiday
 * PID: 5532600
 * NID: ri610670
 * Assignment: COP 3330 - Programming Assignment 2 (Dice Roll Simulation)
 *
 * This program simulates rolling two dice 1000 times and analyzes the
 * distribution of the resulting face values. A Die class represents a
 * single six-sided die that can be rolled randomly, while a Dice class
 * contains two Die objects and returns the sum of their face values.
 * The DiceTester class performs the simulation, counts how many times
 * each possible sum (2–12) occurs, prints the results, and displays
 * a histogram graph representing the distribution of the dice rolls.
 */

public class DiceTester {
    public static void main(String[] args) {

        Dice dice = new Dice();

        // counts[sum] holds occurrences of that sum; sums range 2..12
        int[] counts = new int[13];

        // Roll 1000 times
        for (int i = 0; i < 1000; i++) {
            dice.roll();
            int sum = dice.getFaceValue();
            counts[sum]++;
        }

        // Print occurrences
        for (int sum = 2; sum <= 12; sum++) {
            System.out.println("Number of " + sum + "s are " + counts[sum]);
        }

        // Print histogram
        System.out.println("Graph");

        // y-axis: 175, 150, ..., 0
        for (int level = 175; level >= 0; level -= 25) {
            String label = padTo3(level) + "|";
            StringBuilder line = new StringBuilder();
            line.append(label);

            // 11 columns for sums 2..12
            for (int sum = 2; sum <= 12; sum++) {
                if (counts[sum] >= level) {
                    line.append("*");
                } else {
                    line.append(" ");
                }

                // spacing between columns (keeps it looking like the sample)
                if (sum != 12) {
                    line.append("  ");
                }
            }

            System.out.println(line.toString());
        }

        // x-axis line
        System.out.println("    --------------------------------");

        // x-axis labels with spacing rules from prompt/sample
        // one-digit numbers have two spaces after them; two-digit have one space after them
        System.out.println("    2  3  4  5  6  7  8  9 10 11 12");
    }

    // Pads an integer to width 3 using spaces (no printf)
    private static String padTo3(int n) {
        String s = "" + n;
        if (s.length() == 1) return "  " + s;
        if (s.length() == 2) return " " + s;
        return s;
    }
}
