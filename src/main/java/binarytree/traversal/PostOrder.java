package binarytree.traversal;

import binarytree.creation.Node;

public final class PostOrder {

    public void print(Node node) {

        if (node == null) {
            return;
        }

        print(node.left);
        print(node.right);
        System.out.print(node.value + " ");
    }
}
