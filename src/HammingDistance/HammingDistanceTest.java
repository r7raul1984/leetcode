package HammingDistance;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingDistanceTest {

  @Test public void testHammingDistance() throws Exception {
    HammingDistance hammingDistance = new HammingDistance();
    assertEquals(2, hammingDistance.hammingDistance(1, 4));
    assertEquals(1, hammingDistance.hammingDistance(0, 4));
    assertEquals(30, hammingDistance.hammingDistance(0, Integer.MAX_VALUE - 1));
    assertEquals(0, hammingDistance.hammingDistance(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1));
  }
}
