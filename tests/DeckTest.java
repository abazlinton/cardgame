import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import org.mockito.*;
import static org.mockito.Mockito.*;


public class DeckTest {

  Deck deck;
  Deck fakeDeck;

  @Before
  public void before() {
    deck = new Deck();
    
  }

  @Test
  public void checkDeckStartsWith52Cards() {
    assertEquals(52, deck.size());
  }

  @Test
  public void checkCard13Is2D() {
    Card compareCard = new Card( Suit.DIAMONDS, Rank.TWO );
    assertEquals( compareCard.getSuit(), deck.getCardAt(13).getSuit() );
    assertEquals( compareCard.getRank(), deck.getCardAt(13).getRank() );

  }

}