package ReverseString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
  @Test public void testSumofLeftLeaves() throws Exception {
    ReverseString reverseString = new ReverseString();
    assertEquals("", reverseString.reverseString(""));
    assertEquals("olleh", reverseString.reverseString("hello"));
  }
}
