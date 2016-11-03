import static org.junit.Assert.*;
import org.junit.*;


public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(Suit.HEARTS, Rank.KING);
  }

  @Test
  public void canGetSuit(){
    assertEquals( Suit.HEARTS, card.getSuit() );
  }

  @Test
  public void canGetRank(){
    assertEquals( Rank.KING, card.getRank() );
  }

  }