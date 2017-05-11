package HappyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

  @Test public void testHammingDistance() throws Exception {
    HappyNumber happyNumber = new HappyNumber();
    assertEquals(true, happyNumber.isHappy(1));
    assertEquals(false, happyNumber.isHappy(2));
    assertEquals(true, happyNumber.isHappy(19));
    assertEquals(false, happyNumber.isHappy(0));
    assertEquals(false, happyNumber.isHappy(Integer.MAX_VALUE));
  }
}
