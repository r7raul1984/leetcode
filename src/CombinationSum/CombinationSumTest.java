package CombinationSum;

    import org.junit.Test;

    import static org.junit.Assert.assertEquals;

public class CombinationSumTest {

  @Test public void testCombinationSum() throws Exception {
    CombinationSum combinationSum = new CombinationSum();
    assertEquals("[[2, 2, 3], [7]]",
        combinationSum.combinationSum(new int[] { 2, 3, 6, 7 }, 7).toString());
//    assertEquals("[[7]]", combinationSum.combinationSum(new int[] { 7, 7, 7, 7 }, 7).toString());
  //  assertEquals("[]", combinationSum.combinationSum(new int[] { 0 }, 7).toString());
  //  assertEquals("[[7]]", combinationSum.combinationSum(new int[] { 0, 7 }, 7).toString());
    assertEquals("[[1, 1]]", combinationSum.combinationSum(new int[] { 1 }, 2).toString());
  }
}
