// Dice.java

import java.util.Random;

public class Dice {
    private int numDice;
    private int[] currentValues;
    private Random random;

    public Dice(int numDice) {
        this.numDice = numDice;
        this.currentValues = new int[numDice];
        this.random = new Random();
    }

    public int[] roll() {
        for (int i = 0; i < numDice; i++) {
            currentValues[i] = random.nextInt(6) + 1; // Generate random number 1-6
        }
        return currentValues;
    }

    public int[] getCurrentValues() {
        return currentValues;
    }
}

