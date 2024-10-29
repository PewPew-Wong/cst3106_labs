// YatzyGame.java

public class YatzyGame {
    private int currentPlayer;
    private int currentRound;
    private int totalScore;

    public YatzyGame() {
        startNewGame();
    }

    public void startNewGame() {
        this.currentPlayer = 1;
        this.currentRound = 1;
        this.totalScore = 0;
        System.out.println("New game started!");
    }

    public void endTurn() {
        // Placeholder for ending the current player's turn and switching players
        System.out.println("Player " + currentPlayer + "'s turn ended.");
    }

    public void endGame() {
        // Placeholder for determining the winner and finalizing the game
        System.out.println("Game ended!");
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public int getTotalScore() {
        return totalScore;
    }
}

