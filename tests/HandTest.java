import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;


public class HandTest {

  Hand handAA, handKK, handTT, handT2;
  Card ace, king, ten, two;

  @Before
  public void before(){
    ace = new Card( Suit.HEARTS, Rank.ACE );
    ArrayList<Card> cardsAA = new ArrayList<Card>();
    cardsAA.add(ace);
    cardsAA.add(ace);
    handAA = new Hand( cardsAA );
    
    king = new Card( Suit.HEARTS, Rank.KING );
    ArrayList<Card> cardsKK = new ArrayList<Card>();
    cardsKK.add(king);
    cardsKK.add(king);
    handKK = new Hand( cardsKK );

    ten = new Card( Suit.HEARTS, Rank.TEN );
    ArrayList<Card> cardsTT = new ArrayList<Card>();
    cardsTT.add(ten);
    cardsTT.add(ten);
    handTT = new Hand( cardsTT );
  
    two = new Card( Suit.HEARTS, Rank.TWO );
    ArrayList<Card> cardsT2 = new ArrayList<Card>();
    cardsT2.add(ten);
    cardsT2.add(two);
    handT2 = new Hand( cardsT2 );

  } 

  @Test
  public void testAA(){
    int [] totals = handAA.getTotals();
    assertEquals( 2, totals[0] );
    assertEquals( 12, totals[1] );
  }

  @Test
  public void testKK(){
    int [] totals = handKK.getTotals();
    assertEquals( 20, totals[0]);
  }

  @Test
  public void testTT(){
    int [] totals = handTT.getTotals();
    assertEquals( 20, totals[0] );
  }

  @Test
  public void testT2(){
    int [] totals = handT2.getTotals();
    assertEquals( 12, totals[0] );
  }







}