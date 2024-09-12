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

    public TreeNode buildTree(int[] array) {

        int index = 0;
        TreeNode root = new TreeNode(array[index]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {


            TreeNode node = queue.poll();
            index++;
            if (index >= array.length) {
                continue;
            }
            int lValue = array[index];
            if (lValue == -1) {
                node.left = null;
            } else {
                node.left = new TreeNode(lValue);
                queue.add(node.left);
            }
            index++;
            int rValue = array[index];
            if (rValue == -1) {
                node.right = null;
            } else {
                node.right = new TreeNode(rValue);
                queue.add(node.right);
            }
        }
        return root;
    }
}
