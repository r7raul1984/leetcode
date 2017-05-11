package UglyNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumberTest {

  @Test public void testUglyNumber() throws Exception {
    UglyNumber uglyNumber = new UglyNumber();
    assertEquals(true, uglyNumber.isUgly(6));
    assertEquals(true, uglyNumber.isUgly(8));
    assertEquals(false, uglyNumber.isUgly(14));
    assertEquals(true, uglyNumber.isUgly(1));
    assertEquals(true, uglyNumber.isUgly(9));
    assertEquals(false, uglyNumber.isUgly(Integer.MAX_VALUE));

  }
}
