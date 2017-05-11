package AddDigits;

import org.junit.Test;

import static org.junit.Assert.*;
public class AddDigitsTest {
  @Test public void testAddDigits() throws Exception {
    AddDigits addDigits = new AddDigits();
    assertEquals(2, addDigits.addDigits(38));
    AddDigits1 addDigit1s = new AddDigits1();
    assertEquals(2, addDigit1s.addDigits(38));
  }
}
