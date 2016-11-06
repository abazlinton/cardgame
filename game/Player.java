package game;
import java.util.*;
import game.*;

public class Player {

  private Hand hand;
  String name;

  public Player(String name, Hand hand){
    this.hand = hand;
    this.name = name;
  }

  public Hand getHand(){
    return this.hand;
  }

  public void addCard(Card card){
    this.hand.addCard( card );
  }




}