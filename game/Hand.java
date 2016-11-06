package game;
import java.util.*;
import game.*;


public class Hand {

  private int[] totals;

  private ArrayList<Card> cards;

  public Hand( ArrayList<Card> cards ){
    this.cards = cards;
  }

  public void addCard( Card card ){
    this.cards.add( card );
  }

  public ArrayList<Card> getCards() {
    return this.cards;
  }

  public int [] getTotals() {

    int aceCount = 0;
    for ( Card card : this.cards ) {
      if ( card.getRank() == Rank.ACE ){
        aceCount++;
      }
    }

    if ( aceCount == 0 ) {
      totals = new int[1];
      for ( Card card : this.cards ) {
        int cardValue = card.getRank().ordinal() + 2;
        if ( cardValue > 10 ) {
          cardValue = 10;
        }
        totals[0] += cardValue;
      }
      return totals;
    }
    // We have some Aces so there will be two totals
    totals = new int[2];
    for ( Card card : this.cards ) {
      if ( card.getRank() != Rank.ACE ) {
        int cardValue = card.getRank().ordinal() + 2;
        if ( cardValue > 10 ) {
          cardValue = 10;
        }
        totals[0] += cardValue;
        totals[1] += cardValue;
      }
    }
    totals[0] += aceCount;
    totals[1] += (aceCount - 1) + 11;
    return totals;
    
  }




}