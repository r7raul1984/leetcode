package SameTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameTreeTest {

  @Test public void testSameTree() throws Exception {
    SameTree1 sameTree1 = new SameTree1();
    TreeNode root = null;
    TreeNode root1 = new TreeNode(1);
    assertEquals(false, sameTree1.isSameTree(root, root1));
    root = new TreeNode(1);
    assertEquals(true, sameTree1.isSameTree(root, root1));
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    assertEquals(true, sameTree1.isSameTree(root, root1));
    root1.left.left = new TreeNode(2);
    assertEquals(false, sameTree1.isSameTree(root, root1));


    SameTree sameTree = new SameTree();
    root = null;
    root1 = new TreeNode(1);
    assertEquals(false, sameTree.isSameTree(root, root1));
    root = new TreeNode(1);
    assertEquals(true, sameTree.isSameTree(root, root1));
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    assertEquals(true, sameTree.isSameTree(root, root1));
    root1.left.left = new TreeNode(2);
    assertEquals(false, sameTree.isSameTree(root, root1));

  }
}
