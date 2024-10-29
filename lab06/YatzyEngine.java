// YatzyEngine.java

public class YatzyEngine {
    private int[] scoreTable; // Placeholder for scoring by category

    public YatzyEngine() {
        this.scoreTable = new int[15]; // 15 scoring categories in Yatzy, initialize as needed
    }

    public int calculateScore(String category, int[] diceValues) {
        // Placeholder for actual score calculation logic
        return 0;
    }

    public boolean isValidSelection(String category, int[] diceValues) {
        // Placeholder for checking if the chosen category is valid
        return true;
    }

    public int[] getScoreTable() {
        return scoreTable;
    }
}

