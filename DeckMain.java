import java.util.Scanner;

/**
 * This class contains the main method for the deck of cards.
 * 
 * @author Ryan LaPorte
 */
public class DeckMain {

  public static Deck deck; // Declare the Deck object
  static Scanner keyboard; // Declare the keyboard
  static int numCards; // Declare numCards

  /**
   * Main method that will call the dealOneCard() method and will also ask the user how many cards.
   * they want.
   * 
   * @param args
   */
  public static void main(String[] args) {
    deck = new Deck(); // Initialize deck Deck()
    keyboard = new Scanner(System.in); // Initialize keyboard scanner
    numCards = 0; // Initialize numCards to 0;

    System.out
        .println("How many times would you like to deal? Please enter a number between 0-52.");
    numCards = keyboard.nextInt(); // stores the number of cards the user wants

    for (int x = 0; x < numCards; x++) {
      deck.dealOneCard(); // calls the dealOneCard() method numCards times
    }
  }
}
