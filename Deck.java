import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains the methods used to add the crards and to deal the cards.
 * 
 * @author Ryan LaPorte
 */
public class Deck {

  List<Object> cards = new ArrayList<Object>();
  int count = 0; // set count to zero

  /**
   * This method will add all the cards to the deck (list).
   */
  public void addCards() {

    // Spades
    cards.add("Ace of Spades");
    cards.add("King of Spades");
    cards.add("Queen of Spades");
    cards.add("Jack of Spades");

    for (int x = 2; x < 11; x++) // for loop for filling in the numbers 2 - 10
      cards.add(x + " of Spades");

    // Hearts
    cards.add("Ace of Hearts");
    cards.add("King of Hearts");
    cards.add("Queen of Hearts");
    cards.add("Jack of Hearts");

    for (int x = 2; x < 11; x++) // for loop for filling in the numbers 2 - 10
      cards.add(x + " of Hearts");

    // Clubs
    cards.add("Ace of Clubs");
    cards.add("King of Clubs");
    cards.add("Queen of Clubs");
    cards.add("Jack of Clubs");

    for (int x = 2; x < 11; x++) // for loop for filling in the numbers 2 - 10
      cards.add(x + " of Clubs");

    // Diamonds
    cards.add("Ace of Diamonds");
    cards.add("King of Diamonds");
    cards.add("Queen of Diamonds");
    cards.add("Jack of Diamonds");

    for (int x = 2; x < 11; x++) // for loop for filling in the numbers 2 - 10
      cards.add(x + " of Diamonds");
  }

  /**
   * This method will shuffle all the cards in the deck.
   */
  public void shuffle() {
    if (cards.size() == 0) {
      addCards();// if the list is empty add the cards to the list
    }
    Collections.shuffle(cards);
  }

  /**
   * This method will return the amount of cards the user wants.
   */
  public void dealOneCard() {
    if (count < 1) { // if this is the first time this method is being called the cards will be
                     // shuffled
      shuffle(); // calls the shuffle method
      System.out.println(cards.get(count)); // will print the user's card
      count++; // increase count to keep track of what cards have been used
    } else if (count <= 51) {
      System.out.println(cards.get(count));
      count++;
    }
  }
}
