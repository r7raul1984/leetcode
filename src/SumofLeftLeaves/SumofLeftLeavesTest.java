package SumofLeftLeaves;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumofLeftLeavesTest {

  @Test public void testSumofLeftLeaves() throws Exception {
    SumofLeftLeaves sumofLeftLeaves = new SumofLeftLeaves();
    TreeNode root = null;
    assertEquals(0, sumofLeftLeaves.sumOfLeftLeaves(root));
    root = new TreeNode(1);
    assertEquals(0, sumofLeftLeaves.sumOfLeftLeaves(root));

    root.right = new TreeNode(2);
    assertEquals(0, sumofLeftLeaves.sumOfLeftLeaves(root));

    root.right.right = new TreeNode(3);
    assertEquals(0, sumofLeftLeaves.sumOfLeftLeaves(root));
    root.right.right.right = new TreeNode(5);
    root.right.right.left = new TreeNode(4);
    assertEquals(4, sumofLeftLeaves.sumOfLeftLeaves(root));
  }
}
