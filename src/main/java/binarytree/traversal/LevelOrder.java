package binarytree.traversal;

import binarytree.creation.Node;

import java.util.LinkedList;
import java.util.Queue;

public final class LevelOrder {

    public void print(Node node) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);

        System.out.println();
        while (!queue.isEmpty()) {

            Node currentNode = queue.remove();
            if (currentNode == null) {
                System.out.println();

                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {

                System.out.print(currentNode.value+" ");
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }
}
