package ReverseWordsinaString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsinaStringTest {

  @Test public void testReverseWordsinaString() throws Exception {
    ReverseWordsinaString reverseWordsinaString = new ReverseWordsinaString();
   /* assertEquals("blue is sky the", reverseWordsinaString.reverseWords("the sky is blue"));
    assertEquals("blue is sky the", reverseWordsinaString.reverseWords(" the sky is blue "));
    assertEquals("blue is sky the", reverseWordsinaString.reverseWords(" the sky is      blue "));
    assertEquals("blue the", reverseWordsinaString.reverseWords(" the   blue "));*/
    assertEquals("a", reverseWordsinaString.reverseWords("a"));

  }
}
