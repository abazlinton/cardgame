import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;

public class PlayerTest {


  Card ace;
  ArrayList<Card> cardsAA;
  PontoonHand handAA;
  Player player;

  @Before
  public void before() {
    ace = new Card( Suit.HEARTS, Rank.ACE );
    cardsAA = new ArrayList<Card>();
    cardsAA.add(ace);
    cardsAA.add(ace);
    handAA = new PontoonHand( cardsAA );
    player = new Player("Alex", handAA);
  }

  @Test 
  public void canGetHand(){
    assertEquals( Suit.HEARTS, player.getHand().getCards().get(0).getSuit() );
    System.out.println(player.getHand().getClass());
  }


  @Test 
  public void canAddToHand (){
    player.addCard(ace);
    assertEquals( Suit.HEARTS, player.getHand().getCards().get(2).getSuit() );

  }








}