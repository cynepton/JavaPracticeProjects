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
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");
        System.out.println(randomNumber);
    }
}
