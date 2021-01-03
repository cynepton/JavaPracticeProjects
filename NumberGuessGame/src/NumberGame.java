import java.util.Scanner;

/**
 * This is the main container class for the number guess game.
 */
public class NumberGame {

    /**
     * The main function for the Number Game.
     * @param args Nothing for now
     */
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        Scanner userInput = new Scanner(System.in);

        for (int i = 10; i > 0 ; i--) {
            System.out.println("You have " + i + " guess(es) left. So guess now:");
            int guess = userInput.nextInt();

            // Check if the random number is greater than the guess.
            if (randomNumber > guess) {
                System.out.println("The number is greater than your " + guess + " guess.");
            }
            // Check if the random number is less than the guess.
            if (randomNumber < guess) {
                System.out.println("The number is less than your " + guess + " guess.");
            }
            // Check if the random number is equal to the guess.
            if (randomNumber == guess) {
                hasWon = true;
                break;
            }
        }

            // Check if the user won or ran out of guesses
            if (hasWon){
                System.out.println("CORRECT....YOU WIN!");
            } else {
                System.out.println("GAME OVER....SORRY!");
                System.out.println("The number was " + randomNumber);
            }
    }
}
