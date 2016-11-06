import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;

public class RandTest {


  @Before 
  public void before(){

   

  }

  @Test
  public void testSomething(){
    
    int one = Rand.get(1,1);
    assertEquals(1, one);
    
  }


}


