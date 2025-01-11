package leafOfSum;

import binarytree.creation.Node;
import invertbinarytree.TreeNode;

public class LeafOfSum {

    int leafSum(TreeNode root) {
        // Your code here

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        return leafSum(root.left) + leafSum(root.right);
    }
}
