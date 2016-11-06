package game;
import game.*;
import java.util.*;

public class MvpGame{

  public static void main(String [] args) {


    Deck deck = new Deck();

    Card playerCard1 = deck.pick();
    Card playerCard2 = deck.pick();
    Card dealerCard1 = deck.pick();
    Card dealerCard2 = deck.pick();

    ArrayList<Card> playerCards = new ArrayList<Card>();
    playerCards.add( playerCard1 );
    playerCards.add( playerCard2 ); 
    ArrayList<Card> dealerCards = new ArrayList<Card>();
    dealerCards.add( dealerCard1 );
    dealerCards.add( dealerCard2 );

    PontoonHand playerHand = new PontoonHand( playerCards );
    PontoonHand dealerHand = new PontoonHand( dealerCards );
  

    Player player = new Player("Alex", playerHand);
    Player dealer = new Player("Dealer", dealerHand);


    int playerScore = playerHand.getTotals()[0];
    int dealerScore = dealerHand.getTotals()[0];

    if ( playerHand.getTotals()[1] > playerScore ){
      playerScore = playerHand.getTotals()[1];
    }
    if ( dealerHand.getTotals()[1] > dealerScore ){
      dealerScore = dealerHand.getTotals()[1];
    }

    if ( playerScore > dealerScore ){
      System.out.println("You Win! " + playerScore + " VS " + dealerScore);
    } else if ( playerScore == dealerScore ) {
      System.out.println("Tied " + playerScore + " VS " + dealerScore);
    } else {
      System.out.println("You Lose! " + playerScore + " VS " + dealerScore);
    }
    

  

  }
}