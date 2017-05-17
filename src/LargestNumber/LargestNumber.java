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
    int[] isuse = new int[nums.length];//1 use 0 not use

    for (int i = 0; i < nums.length; i++) {
      int number = nums[i];
      digitCount[i] = digitCount(number);
    }
    for (int i = 0; i < nums.length; i++) {
      hdigit[i] = getHdigit(nums[i]);
    }

    for (int k = 0; k < nums.length; k++) {

      List<Integer> maxDigitIndex = getMaxDigitIndexList(hdigit, isuse);
      if (maxDigitIndex.size() == 1) {
        isuse[maxDigitIndex.get(0)] = 1;
        result += nums[maxDigitIndex.get(0)];
      }else if(maxDigitIndex.size() > 1){
        int index = maxDigitIndex.get(0);

      }
    }
    return result;
  }

  public List<Integer> getMaxDigitIndexList(int[] hdigit, int[] isuse) {
    List<Integer> maxhdigitIndex = new ArrayList<>();//should isuse
    for (int k = 0; k < isuse.length; k++) {
      if (isuse[k] == 0) {
        maxhdigitIndex.add(k);
        break;
      }
    }

    for (int i = maxhdigitIndex.get(0); i < hdigit.length; i++) {
      if (isuse[i] == 1) {
        continue;
      }
      if (hdigit[i] > hdigit[maxhdigitIndex.get(0)]) {
        maxhdigitIndex.clear();
        maxhdigitIndex.add(i);
      } else if (hdigit[i] == hdigit[maxhdigitIndex.get(0)] &&maxhdigitIndex.get(0) != i){
        maxhdigitIndex.add(i);
      }
    } return maxhdigitIndex;
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
