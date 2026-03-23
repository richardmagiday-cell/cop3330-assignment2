package assignment2;

/*
 * Programming Assignment 2 - Dice class
 * Represents a pair of dice (two Die objects).
 */

public class Dice {
    private Die die1;
    private Die die2;

    // No-argument constructor: initializes both dice faceValues to 1
    public Dice() {
        die1 = new Die(); // Die constructor sets to 1
        die2 = new Die(); // Die constructor sets to 1
    }

    // Returns the sum of the two dice face values
    public int getFaceValue() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    // Rolls both dice. Prints nothing.
    public void roll() {
        die1.roll();
        die2.roll();
    }
}
