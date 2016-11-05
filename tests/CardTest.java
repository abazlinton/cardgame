import static org.junit.Assert.*;
import org.junit.*;
import game.*;


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

  @Test 
  public void testComparisons(){
    Card two = new Card(Suit.HEARTS, Rank.TWO);
    Card twoAgain = new Card(Suit.HEARTS, Rank.TWO);
    Card three = new Card(Suit.HEARTS, Rank.THREE);
    assertEquals( -1, two.compareTo( three ));
    assertEquals( 0, two.compareTo( twoAgain ));
    assertEquals( 1, three.compareTo( two ));


  }

  }