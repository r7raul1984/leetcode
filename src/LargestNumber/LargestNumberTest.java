package LargestNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

  @Test public void testHappyNumber() throws Exception {
    LargestNumber largestNumber = new LargestNumber();
    /*assertEquals(true, happyNumber.isHappy(1));
    assertEquals(false, happyNumber.isHappy(2));
    assertEquals(true, happyNumber.isHappy(19));
    assertEquals(false, happyNumber.isHappy(0));
    assertEquals(false, happyNumber.isHappy(Integer.MAX_VALUE));*/
    System.out.println(largestNumber.getHdigit(0));
    System.out.println(largestNumber.getMaxDigitIndexList(new int[] { 9, 2, 1 }));
    System.out.println(largestNumber.largestNumber(new int[] { 3, 30, 34, 5, 9 }));


  }
}
