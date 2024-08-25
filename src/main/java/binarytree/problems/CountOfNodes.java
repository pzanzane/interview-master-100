package binarytree.problems;

import binarytree.creation.Node;

public class CountOfNodes {

    public int count(Node root) {
        return root == null ? 0 : count(root.left) + count(root.right) + 1;
    }
}
