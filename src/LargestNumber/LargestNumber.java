package LargestNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//#179. Largest Number
public class LargestNumber {

  public String largestNumber(int[] nums) {
    String result = "";
    int[] digitCount = new int[nums.length];
    int[] hdigit = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int number = nums[i];
      digitCount[i] = digitCount(number);
    }

    for (int i = 0; i < nums.length; i++) {
      hdigit[i] = getHdigit(nums[i]);
    }
    List<Integer> maxDigitIndex = getMaxDigitIndexList(hdigit);

    for (Integer index : maxDigitIndex) {
      result += nums[index] + " ";
    }

    return result;
  }

  public List<Integer> getMaxDigitIndexList(int[] hdigit) {
    List<Integer> maxhdigitIndex = new ArrayList<>();
    maxhdigitIndex.add(0);
    for (int i = 1; i < hdigit.length; i++) {
      if (hdigit[i] > hdigit[maxhdigitIndex.get(0)]) {
        maxhdigitIndex.clear();
        maxhdigitIndex.add(i);
      } else if (hdigit[i] == hdigit[maxhdigitIndex.get(0)]) {
        maxhdigitIndex.add(i);
      }
    }
    return maxhdigitIndex;
  }

  public int getHdigit(int number) {
    char[] charArray = { String.valueOf(number).toCharArray()[0] };
    int highest = Integer.parseInt(new String(charArray));
    return highest;
  }

  public int digitCount(int number) {
    return String.valueOf(number).length();
  }
}
