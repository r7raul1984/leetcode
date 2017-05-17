package FindBottomLeftTreeValue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindBottomLeftTreeValueTest {

  @Test public void testFindBottomLeftTreeValue() throws Exception {
    FindBottomLeftTreeValue findBottomLeftTreeValue = new FindBottomLeftTreeValue();
    TreeNode root = new TreeNode(1);
    assertEquals(1, findBottomLeftTreeValue.findBottomLeftValue(root));
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    assertEquals(2, findBottomLeftTreeValue.findBottomLeftValue(root));
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    assertEquals(4, findBottomLeftTreeValue.findBottomLeftValue(root));
    root.right.left.left = new TreeNode(7);
    assertEquals(7, findBottomLeftTreeValue.findBottomLeftValue(root));
  }
}
