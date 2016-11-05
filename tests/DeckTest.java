import static org.junit.Assert.*;
import org.junit.*;
import game.*;


public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void checkDeckStartsWith52Cards() {
    assertEquals(52, deck.size());
  }

  @Test
  public void checkCard13IsDiamonds() {
    Card card = deck.pick();
    assertEquals(Suit.DIAMONDS, card.getSuit());
  }

}