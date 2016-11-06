package game;
import java.util.*;
import game.*;


public class PontoonHand {

  private int[] totals;

  private ArrayList<Card> cards;

  public PontoonHand( ArrayList<Card> cards ){
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

    if ( aceCount == 0 ){
      totals = new int[1];
    }
    else {
      totals = new int[2];
    }

    for ( Card card : this.cards ) {
      if ( card.getRank() != Rank.ACE ) {
        int cardValue = card.getRank().ordinal() + 2;
        if ( cardValue > 10 ) {
          cardValue = 10;
        }
        totals[0] += cardValue;
      }
    }

    if ( aceCount == 0 ) {return totals;}
    
    totals[1] = totals[0];
    totals[0] += aceCount;
    totals[1] += (aceCount - 1) + 11;
    return totals;
    
  }




}