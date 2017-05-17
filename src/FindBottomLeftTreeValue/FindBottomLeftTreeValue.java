package FindBottomLeftTreeValue;

import java.util.*;

/**
 * #513. Find Bottom Left Tree Value
 */
public class FindBottomLeftTreeValue {

  public int findBottomLeftValue(TreeNode root) {
    if (root.left == null && root.right == null) {
      return root.val;
    }
    List<TreeNode> childs = Collections.singletonList(root);
    int count = 0;
    int result = -1;
    do {
      List<TreeNode> newChild = new LinkedList<TreeNode>();
      for (TreeNode child : childs) {
        if (child.left != null) {
          if (count == 0) {
            result = child.left.val;
            count++;
          }
          newChild.add(child.left);
        }
        if (child.right != null) {
          if (count == 0) {
            result = child.right.val;
            count++;
          }
          newChild.add(child.right);
        }
      }
      childs = new LinkedList<TreeNode>(newChild);
      count = 0;
    } while (!childs.isEmpty());
    return result;
  }

}
