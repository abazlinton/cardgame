import java.util.*;

public class Deck {

  private ArrayList<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();
    make();
  }

  public int size() {
    return cards.size();
  }

  public Card pick(){
    int position = randomNumber(0, (size() - 1));
    return cards.remove(position);
  }

  private int randomNumber(int min, int max){
    Random rand = new Random();
    int result = rand.nextInt((max - min) + 1) + min;
    return result;
  }

  private void make() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(suit, rank);
        this.cards.add(card);
      }
    }
  }

}