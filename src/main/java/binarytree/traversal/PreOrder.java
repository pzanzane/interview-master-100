package binarytree.traversal;

import binarytree.creation.Node;

public final class PreOrder {

    public void print(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        print(node.left);
        print(node.right);
    }
}
