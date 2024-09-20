package diameterofbinarytree;

import invertbinarytree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    @Test
    void diameterOfBinaryTree_test1() {

        // Assign
        TreeNode root = TreeNode.buildTree(new int[] {1,2,3,4,5});
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        int expected = 3;

        // Act
        int actual = diameterOfBinaryTree.diameterOfBinaryTree(root);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}