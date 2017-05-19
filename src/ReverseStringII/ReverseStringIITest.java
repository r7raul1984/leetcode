package ReverseStringII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringIITest {

  @Test public void testReverseWordsinaString() throws Exception {
    ReverseStringII reverseStringII = new ReverseStringII();
    assertEquals("bacdfeg", reverseStringII.reverseStr("abcdefg", 2));
    assertEquals("a", reverseStringII.reverseStr("a", 2));
    assertEquals("abc", reverseStringII.reverseStr("abc", 1));
    assertEquals("", reverseStringII.reverseStr("", 1));
    assertEquals("bacdfeghjiklnm", reverseStringII.reverseStr("abcdefghijklmn", 2));
    assertEquals("cbadefg", reverseStringII.reverseStr("abcdefg", 3));
    assertEquals("bacd", reverseStringII.reverseStr("abcd", 2));
    assertEquals("gfedcba", reverseStringII.reverseStr("abcdefg", 8));



   /* Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string.
        If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
        then reverse the first k characters and left the other as original.*/
  }
}
