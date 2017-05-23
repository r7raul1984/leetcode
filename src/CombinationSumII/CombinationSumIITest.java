package CombinationSumII;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CombinationSumIITest {
  @Test public void testCombinationSumII() throws Exception {
    CombinationSumII combinationSum = new CombinationSumII();
    assertEquals("[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]",
        combinationSum.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8).toString());
  }

}
