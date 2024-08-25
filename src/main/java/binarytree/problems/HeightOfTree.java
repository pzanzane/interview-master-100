package binarytree.problems;

import binarytree.creation.Node;

public class HeightOfTree {

    public int height(Node root) {

        return root == null ? 0 : Math.max(height(root.left), height(root.right)) + 1;
    }
}
