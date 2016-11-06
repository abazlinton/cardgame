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


    int playerScore1 = player.getHand().getTotals()[0];
    int playerScore2 = player.getHand().getTotals()[1];
    int dealerScore1 = dealer.getHand().getTotals()[0];
    int dealerScore2 = dealer.getHand().getTotals()[1];

    if ( playerScore2 > playerScore1 ){
      playerScore1 = playerScore2;
    }
    if ( dealerScore2 > dealerScore1 ){
      dealerScore1 = dealerScore2;
    }

    if ( playerScore1 > dealerScore1 ){
      System.out.println("You Win! " + playerScore1 + " VS " + dealerScore1);
    } else if ( playerScore1 == dealerScore1 ) {
      System.out.println("Tied " + playerScore1 + " VS " + dealerScore1);
    } else {
      System.out.println("You Lose! " + playerScore1 + " VS " + dealerScore1);
    }
    

  

  }
}