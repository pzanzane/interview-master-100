package sortedarraytobinarysearchtree;

import invertbinarytree.TreeNode;

public class SortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length <= 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int middle = (left + right) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = sortedArrayToBST(nums, left, middle - 1);
        node.right = sortedArrayToBST(nums, middle + 1, right);
        return node;
    }
}
