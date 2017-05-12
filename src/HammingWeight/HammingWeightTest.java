package HammingWeight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingWeightTest {
  @Test public void testHappyNumber() throws Exception {
    HammingWeight hammingWeight = new HammingWeight();
    assertEquals(3, hammingWeight.hammingWeight(11));
  }
}
