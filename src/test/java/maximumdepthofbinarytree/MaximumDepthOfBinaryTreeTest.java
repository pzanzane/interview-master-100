package maximumdepthofbinarytree;

import binarytree.creation.ArrayToTree;
import binarytree.creation.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepth_test1() {

        // Assign
        Node root = new ArrayToTree().toTree(new int[] {3,9,20,-1,-1,15,7});
        MaximumDepthOfBinaryTree maxDepth = new MaximumDepthOfBinaryTree();
        int expected = 3;

        // Act
        int actual = maxDepth.maxDepth(root);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxDepth_test2() {

        // Assign
        Node root = new ArrayToTree().toTree(new int[] {1,-1,2});
        MaximumDepthOfBinaryTree maxDepth = new MaximumDepthOfBinaryTree();
        int expected = 2;

        // Act
        int actual = maxDepth.maxDepth(root);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}