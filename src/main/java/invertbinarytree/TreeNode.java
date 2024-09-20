package invertbinarytree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildTree(int[] array) {

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
