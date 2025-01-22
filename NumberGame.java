import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number game!");
        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            System.out.println("I'm thinking of a number between " + lowerRange + " and " + upperRange + ".");

            int attempts = 0;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly in "
                            + attempts + " attempts.");
                    score++;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println(
                        "Sorry, you've reached the maximum number of attempts. The number was " + targetNumber + ".");
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Game over! You played " + rounds + " rounds and your final score is " + score + ".");
        scanner.close();
    }
}


// Number of Attempts:

// The player has a maximum of 10 attempts to guess the correct number.
// If the player reaches the maximum number of attempts without guessing the correct number, the game informs the player and reveals the target number.
// Scoring System:

// The scoring system is not fully visible in the provided code, but typically, the score would be incremented based on the player's performance (e.g., fewer attempts might result in a higher score).
// Game Rounds:

// The game keeps track of the number of rounds played using the rounds variable.
// After each round, the player is asked if they want to play again. If the player chooses "yes", a new round starts; otherwise, the game ends.
// Game Over:

// When the player decides not to play again, the game prints the total number of rounds played and the final score.
