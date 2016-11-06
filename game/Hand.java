package game;
import game.*;
import java.util.*;

public interface Hand {

  public void addCard( Card card );

  public int [] getTotals();

  public ArrayList<Card> getCards();

}