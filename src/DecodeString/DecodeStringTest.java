package DecodeString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringTest {
  @Test public void testDecodeString() throws Exception {
    DecodeString decodeString = new DecodeString();
    assertEquals("", decodeString.decodeString(""));
    assertEquals("aa", decodeString.decodeString("2[a]"));
    assertEquals("aaaaaaaaaaa", decodeString.decodeString("11[a]"));
    assertEquals("ababababababababababab", decodeString.decodeString("11[ab]"));
    assertEquals("ab---ab---ab---ab---ab---ab---ab---ab---ab---ab---ab---", decodeString.decodeString("11[ab3[-]]"));
    assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
    assertEquals("abcdcdcdabcdcdcdxyxyxyxy", decodeString.decodeString("2[ab3[cd]]4[xy]"));

    /*Input:
    "2[ab3[cd]]4[xy]"
    Output:
    "abdcdcdcabdcdcdcxyxyxyxy"
    Expected:
    "abcdcdcdabcdcdcdxyxyxyxy"*/


  }
}
