package maximumdepthofbinarytree;

import binarytree.creation.Node;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(Node root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
