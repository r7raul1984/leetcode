package FindLargestValueinEachTreeRow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestValuesTest {

  @Test public void testLargestValues() throws Exception {
    LargestValues largestValues = new LargestValues();
    TreeNode root = new TreeNode(1);
    assertEquals("[1]", largestValues.largestValues(root).toString());
    root.left = new TreeNode(3);
    root.right = new TreeNode(2);
    assertEquals("[1, 3]", largestValues.largestValues(root).toString());

    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right.right = new TreeNode(9);
    assertEquals("[1, 3, 9]", largestValues.largestValues(root).toString());
  }
}
