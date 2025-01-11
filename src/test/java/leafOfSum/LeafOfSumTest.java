package leafOfSum;

import invertbinarytree.InvertBinaryTree;
import invertbinarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafOfSumTest {

    @Test
    void leafSum() {

        TreeNode root = TreeNode.buildTree(new int[]{10,20,30,40,60, -1, -1});
        LeafOfSum leafOfSum = new LeafOfSum();
        int count = leafOfSum.leafSum(root);

    }
}