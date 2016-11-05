package game;
import java.util.*;
import game.*;

public class RandomNumber {

  public static int get(int min, int max){
    Random rand = new Random();
    int result = rand.nextInt((max - min) + 1) + min;
    return result;
  }

}