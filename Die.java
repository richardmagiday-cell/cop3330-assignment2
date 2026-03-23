package assignment2;

import java.util.Random;

/*
 * Programming Assignment 2 - Die class
 * Represents a single 6-faced die.
 */

public class Die {
    
    private int faceValue;

    // One shared Random object for all dice rolls
    private static final Random RNG = new Random();

    // No-argument constructor: initializes faceValue to 1
    public Die() {
        faceValue = 1;
    }

    // Getter for faceValue
    public int getFaceValue() {
        return faceValue;
    }

    // Setter for faceValue (uses the argument)
    public void setFaceValue(int value) {
        // Keep it safe; spec doesn't require validation, but this prevents invalid states
        if (value >= 1 && value <= 6) {
            faceValue = value;
        }
    }

    // Roll the die randomly (1 to 6 inclusive). Prints nothing.
    public void roll() {
        faceValue = RNG.nextInt(6) + 1; // 0..5 + 1 => 1..6
    }
}
