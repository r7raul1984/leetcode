package LargestNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

  @Test public void testHappyNumber() throws Exception {
    LargestNumber largestNumber = new LargestNumber();
    System.out.println(largestNumber.getHdigit(125));
    System.out.println(largestNumber.getMaxDigitIndexList(new int[] { 9, 2, 1 },new int[] { 1, 0, 0 }));
    System.out.println(largestNumber.largestNumber(new int[] { 3, 5, 9 }));
    System.out.println(largestNumber.largestNumber(new int[] { 3, 9, 9 }));

  }
}
