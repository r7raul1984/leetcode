package Sum3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum3Test {
  @Test public void testSum3() throws Exception {
    Sum3 sum3 = new Sum3();
    assertEquals("[[-1, -1, 2], [-1, 0, 1]]",
        sum3.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }).toString());
  }
}
