package FindLargestValueinEachTreeRow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * #515. Find Largest Value in Each Tree Row
 */
public class LargestValues {

  public List<Integer> largestValues(TreeNode root) {

    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    result.add(root.val);

    List<Integer> collector = new ArrayList<>();
    List<TreeNode> childs = new ArrayList<>();

    if (root.left != null) {
      childs.add(root.left);
    }
    if (root.right != null) {
      childs.add(root.right);
    }
    findLargest(childs, collector);
    result.addAll(collector);
    return result;
  }

  private void findLargest(List<TreeNode> nodes, List<Integer> result) {

    if (nodes.isEmpty()) {
      return;
    }

    nodes.sort(new Comparator<TreeNode>() {

      @Override public int compare(TreeNode o1, TreeNode o2) {
        return Integer.compare(o2.val, o1.val);
      }
    });
    result.add(nodes.get(0).val);
    List<TreeNode> childes = new ArrayList<>();
    for (TreeNode node : nodes) {
      if (node.left != null) {
        childes.add(node.left);
      }
      if (node.right != null) {
        childes.add(node.right);
      }
    }
    findLargest(childes, result);

  }

}
