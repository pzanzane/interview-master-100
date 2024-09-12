package invertbinarytree;

import binarytree.creation.ArrayToTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    @Test
    void invert_test1() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode root = invertBinaryTree.buildTree(new int[]{4,2,7,1,3,6,9});
    }

    @Test
    void invert_test2() {
    }

    @Test
    void invert_test3() {
    }
}