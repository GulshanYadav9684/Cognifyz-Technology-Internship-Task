import java.util.Scanner;

class TextBasedGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Rules: You have 3 chances to guess the correct number between 1 and 10.");

        // Generate a random number between 1 and 10
        int targetNumber = (int) (Math.random() * 10) + 1;
        int attempts = 3;
        boolean hasWon = false;

        while (attempts > 0) {
            System.out.println("\nYou have " + attempts + " attempt(s) left. Enter your guess:");
            int playerGuess = scanner.nextInt();

            if (playerGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                hasWon = true;
                break;
            } else if (playerGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            attempts--;
        }

        if (!hasWon) {
            System.out.println("\nGame over! The correct number was " + targetNumber + ". Better luck next time!");
        }

        scanner.close();
    }
}
