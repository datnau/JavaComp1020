import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeckShuffle {

    public static final int DECK_SIZE = 20;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<Integer> deck = makeDeck(DECK_SIZE);
        System.out.println("The new deck is " + deck);

        shuffle(deck);
        System.out.println("The shuffled deck is " + deck);

        System.out.print("How many hands should be dealt? ");
        int numHands = keyboard.nextInt();
        System.out.print("How many cards in each hand? ");
        int numCards = keyboard.nextInt();

        ArrayList[] theHands = deal(deck, numHands, numCards);
        System.out.println("The hands are:");
        for (int i = 0; i < numHands; i++)
            System.out.println("Hand " + i + ": " + theHands[i]);
        System.out.println("The remaining deck: " + deck);
    }

    public static ArrayList<Integer> makeDeck(int numCards) {
        ArrayList<Integer> deck = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            deck.add(i);
        }
        return deck;
    }

    public static void shuffle(ArrayList<Integer> deck) {
        Collections.shuffle(deck);
    }

    public static ArrayList[] deal(ArrayList<Integer> deck, int numHands, int numCards) {
        ArrayList[] hands = new ArrayList[numHands];
        for (int i = 0; i < numHands; i++) {
            hands[i] = new ArrayList<>();
        }

        int cardIndex = 0;
        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numHands; j++) {
                if (cardIndex >= deck.size()) {
                    break;
                }
                hands[j].add(deck.get(cardIndex));
                cardIndex++;
            }
        }

        // Remove dealt cards from the deck
        for (ArrayList<Integer> hand : hands) {
            for (Object card : hand) {
                deck.remove(card);
            }
        }

        return hands;
    }
}
