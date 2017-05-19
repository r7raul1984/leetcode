package SumofLeftLeaves;

/**
 * 404. Sum of Left Leaves
 */
public class SumofLeftLeaves {

  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 0;
    }
    return sum(root.left, true) + sum(root.right, false);
  }

  public int sum(TreeNode treeNode, boolean left) {
    if (treeNode == null) {
      return 0;
    }
    if (left && treeNode.left == null && treeNode.right == null) {
      return treeNode.val;
    }
    return sum(treeNode.left, true) + sum(treeNode.right, false);
  }
}
