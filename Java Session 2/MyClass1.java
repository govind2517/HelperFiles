import java.util.Random;

public class MyClass1{
	// 1. While loop
	public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("Loop ended.\n================================");
		
		// Next example playing dice game
		// Create object of DiceGame
		DiceGame dg = new DiceGame();
		dg.playDice();
	
    }
}

class DiceGame {
	public void playDice() {
        Random random = new Random();
        int playerScore = 0;
        int computerScore = 0;
        int rounds = 0;

        while (rounds < 5) { // Play 5 rounds
            rounds++;
            int playerRoll = random.nextInt(6) + 1; // Roll a 6-sided dice
            int computerRoll = random.nextInt(6) + 1;

            System.out.println("Round " + rounds);
            System.out.println("Player rolls: " + playerRoll);
            System.out.println("Computer rolls: " + computerRoll);

            if (playerRoll > computerRoll) {
                System.out.println("Player wins this round!");
                playerScore++;
            } else if (playerRoll < computerRoll) {
                System.out.println("Computer wins this round!");
                computerScore++;
            } else {
                System.out.println("It's a tie!");
            }
        }

        System.out.println("====================================\nGame Over!");
        System.out.println("Player Score: " + playerScore);
        System.out.println("Computer Score: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("Player wins the game!");
        } else if (playerScore < computerScore) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("It's a tie game!");
        }
    }
}