package game;
import game.*;

public class Card implements Comparable<Card> {

  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public int compareTo( Card card ){
    if ( this.getRank().ordinal() < card.getRank().ordinal() ) {
      return -1;
    } else if ( this.getRank().ordinal() == card.getRank().ordinal() ) {
      return 0;
    } else {
      return 1;
    }
 

  }




}