package Sum3;

import java.util.*;

/**
 * 15. 3Sum
 */
public class Sum3 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0, 0);
    list = new ArrayList<>(new HashSet<>(list));
    return list;
  }

  //new int[] { -1, 0, 1, 2, -1, -4 }
  private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int sum,
      int start) {

    if (tempList.size() == 3) {
      if (sumall(tempList) == 0) {
        List<Integer> rs = new ArrayList<>(tempList);
        Collections.sort(rs);
        list.add(rs);
      }
    } else {
      for (int i = start; i < nums.length; i++) {
        if (nums[i] > sum)
          return;
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, sum - nums[i],
            i + 1); // not i + 1 because we can reuse same elements
        tempList.remove(tempList.size() - 1);
      }
    }
  }

  int sumall(List<Integer> tempList) {
    int total = tempList.get(0);
    for (Integer i : tempList) {
      total += i;
    }
    return total - tempList.get(0);
  }
}
