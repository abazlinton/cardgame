import static org.junit.Assert.*;
import org.junit.*;
import game.*;


public class RandomNumberTest {


  @Before 
  public void before(){

   

  }

  @Test
  public void testSomething(){
    
    int one = RandomNumber.get(1,1);
    assertEquals(1, one);
    
  }


}


