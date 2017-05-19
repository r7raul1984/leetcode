package ReverseWordsinaStringIII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsinaStringIIITest {
  @Test public void testReverseWordsinaString() throws Exception {
    ReverseWordsinaStringIII reverseWordsinaStringIII = new ReverseWordsinaStringIII();
    assertEquals("eht yks si eulb", reverseWordsinaStringIII.reverseWords("the sky is blue"));
    assertEquals("a", reverseWordsinaStringIII.reverseWords("a"));

    assertEquals("eht   yks si eulb", reverseWordsinaStringIII.reverseWords("the   sky is blue"));

  }
}
