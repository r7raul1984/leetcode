package TwoSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

  @Test public void testTwoSum() throws Exception {
    TwoSum twoSum = new TwoSum();
    int[] rs = twoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    assertEquals(0, rs[0]);
    assertEquals(1, rs[1]);
    rs = twoSum.twoSum(new int[] { 9, 0 }, 9);
    assertEquals(0, rs[0]);
    assertEquals(1, rs[1]);
    rs = twoSum.twoSum(new int[] { -1, 10 }, 9);
    assertEquals(0, rs[0]);
    assertEquals(1, rs[1]);
  }
}
