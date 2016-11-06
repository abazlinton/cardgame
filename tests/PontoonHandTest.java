import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;


public class PontoonHandTest {

  PontoonHand handAA, handKK, handTT, handT2, handA2, handAA2;
  Card ace, king, ten, two;


  @Before
  public void before(){

    ace = new Card( Suit.HEARTS, Rank.ACE );
    ArrayList<Card> cardsAA = new ArrayList<Card>();
    cardsAA.add(ace);
    cardsAA.add(ace);
    handAA = new PontoonHand( cardsAA );
    
    king = new Card( Suit.HEARTS, Rank.KING );
    ArrayList<Card> cardsKK = new ArrayList<Card>();
    cardsKK.add(king);
    cardsKK.add(king);
    handKK = new PontoonHand( cardsKK );

    ten = new Card( Suit.HEARTS, Rank.TEN );
    ArrayList<Card> cardsTT = new ArrayList<Card>();
    cardsTT.add(ten);
    cardsTT.add(ten);
    handTT = new PontoonHand( cardsTT );
  
    two = new Card( Suit.HEARTS, Rank.TWO );
    ArrayList<Card> cardsT2 = new ArrayList<Card>();
    cardsT2.add(ten);
    cardsT2.add(two);
    handT2 = new PontoonHand( cardsT2 );

    ArrayList<Card> cardsA2 = new ArrayList<Card>();
    cardsA2.add(ace);
    cardsA2.add(two);
    handA2 = new PontoonHand( cardsA2 );

    ArrayList<Card> cardsAA2 = new ArrayList<Card>();
    cardsAA2.add(ace);
    cardsAA2.add(ace);
    cardsAA2.add(two);
    handAA2 = new PontoonHand( cardsAA2 );

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

  @Test
  public void testA2(){
    int [] totals = handA2.getTotals();
    assertEquals( 3, totals[0] );
    assertEquals( 13, totals[1] );
  }

  @Test
  public void testAA2(){
    int [] totals = handAA2.getTotals();
    assertEquals( 4, totals[0] );
    assertEquals( 14, totals[1] );
  }







}