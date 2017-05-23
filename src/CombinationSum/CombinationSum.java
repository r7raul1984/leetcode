package CombinationSum;

import java.util.*;

/**
 *39. Combination Sum
 */
public class CombinationSum {


  public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
  }

  private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{
      for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
        tempList.remove(tempList.size() - 1);
      }
    }
  }
}
  /*
  https://discuss.leetcode.com/topic/46161/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/8
  @HaitaoSun Say remain is 7, and you have numbers 8,9,10,11,12,13,14,15,16....... up to a huge number.

    If you put the condition in the for loop, it'll break out as soon as you see '8'. In OP's case, it'll check through all the numbers even when it could have just stopped after 8.

    So actually, sorting the numbers CAN be useful, if you add the condition I stated to the for loop. Otherwise, sorting the numbers is useless because you aren't using the fact that they're sorted to prune your possible results.
*/

