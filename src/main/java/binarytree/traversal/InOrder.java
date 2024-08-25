package binarytree.traversal;

import binarytree.creation.Node;

public final class InOrder {

    public void print(Node node) {

        if (node == null) {
            return;
        }

        print(node.left);
        System.out.print(node.value + " ");
        print(node.right);
    }
}
