package SameTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 100. Same Tree
 */
public class SameTree1 {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    Queue<TreeNode> pchild = new LinkedList<TreeNode>();
    Queue<TreeNode> qchild = new LinkedList<TreeNode>();
    pchild.add(p);
    qchild.add(q);
    do {
      TreeNode chilep = pchild.poll();
      TreeNode chileq = qchild.poll();

      if (chilep == null && chileq != null) {
        return false;
      }
      if (chilep != null && chileq == null) {
        return false;
      }
      if (chilep == null && chileq == null) {
        continue;
      }
      if (chilep.val != chileq.val) {
        return false;
      }

      pchild.add(chilep.left);
      pchild.add(chilep.right);

      qchild.add(chileq.left);
      qchild.add(chileq.right);

    } while (pchild.size() == qchild.size() && !pchild.isEmpty() && !qchild.isEmpty());

    return true;
  }
}
