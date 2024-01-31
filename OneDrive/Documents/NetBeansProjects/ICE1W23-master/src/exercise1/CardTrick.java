package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that models a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Vansh Prajapati 
 * @since Jan 31, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber());
            card.setSuit(Card.SUITS[generateRandomNumber(4)]);
            hand[i] = card;
        }

        // Print out the generated cards (for debugging)
        System.out.println("Generated Cards:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the card suit (1-4): ");
        int userSuit = scanner.nextInt();

        // Search for the user's card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(Card.SUITS[userSuit - 1])) {
                found = true;
                break;
            }
        }

        // If the guess is successful, invoke the printInfo() method
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found.");
        }
    }

    /**
     * Generates a random number between 0 and 12 (inclusive) representing card values.
     *
     * @return Randomly generated card value.
     */
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    /**
     * Generates a random number between 0 and (max-1) representing card suits.
     *
     * @param max The upper bound for the random number (exclusive).
     * @return Randomly generated card suit index.
     */
    private static int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    /**
     * A simple method to print out personal information.
     * Replace this information with your own.
     * @author [Your Name]
     * @since [Current Date]
     */
    //I am Done.
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        // Add your personal information here
        System.out.println("My name is Vansh Prajapati, and I'm the author of this program.");
        System.out.println("I am student at Sheridan College, enrolled in Computer Programming.");
        System.out.println("I enjoy reading and travelling and aspire to Software Engineer.");

        System.out.println();
    }
}
