package diameterofbinarytree;

import invertbinarytree.TreeNode;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int leftHeight = root.left == null ? 0 : root.left.val;
        int rightHeight = root.right == null ? 0 : root.right.val;

        root.val = Math.max(leftHeight, rightHeight) + 1;
        int newDiameter = leftHeight + rightHeight;
        return Math.max(newDiameter, Math.max(leftDiameter, rightDiameter));
    }
}
