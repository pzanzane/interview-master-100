package invertbinarytree;

import binarytree.creation.Node;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public TreeNode invert(TreeNode root) {

        if (root == null) {
            return null;
        }

        invert(root.left);
        invert(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
