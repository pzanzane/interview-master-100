package sortedarraytobinarysearchtree;

import invertbinarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayToBinarySearchTreeTest {

    @Test
    void sortedArrayToBST() {

        int[] nums = {-10,-3,0,5,9};

        SortedArrayToBinarySearchTree bst = new SortedArrayToBinarySearchTree();
        TreeNode treeNode = bst.sortedArrayToBST(nums);


    }
}